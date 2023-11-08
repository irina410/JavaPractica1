package pr5.Task4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWindow extends JFrame {
    private JLabel animationLabel;
    private int currentFrame = 0;
    private Timer animationTimer;
    private ImageIcon[] frames;

    public AnimationWindow() {
        // Создаем окно
        super("Пример анимации");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Загружаем спрайты (картинки для анимации)
        frames = new ImageIcon[3]; // 3 кадра в анимации
        frames[0] = new ImageIcon("/home/limonchik/IdeaProjects/Practica1/src/pr5/Task4/fr1.png"); // Замените  на путь к вашему изображению
        frames[1] = new ImageIcon("/home/limonchik/IdeaProjects/Practica1/src/pr5/Task4/fr2.png"); // Замените  на путь к следующему изображению
        frames[2] = new ImageIcon("//home/limonchik/IdeaProjects/Practica1/src/pr5/Task4/fr3.png"); // Замените  на путь к последнему изображению

        // Создаем метку для отображения анимации
        animationLabel = new JLabel();
        add(animationLabel);

        // Создаем таймер для анимации
        int delay = 200; // Задержка в миллисекундах между кадрами
        animationTimer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });
    }

    public void startAnimation() {
        animationTimer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnimationWindow window = new AnimationWindow();
                window.startAnimation();
                window.setVisible(true);
            }
        });
    }
}