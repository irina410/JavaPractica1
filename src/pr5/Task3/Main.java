package pr5.Task3;

import javax.swing.*;
import java.awt.*;

//Этот класс представляет собой основное окно приложения
//Он отображает выбранное изображение на панели
public class Main extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Image image;

    /**
     Конструктор класса pr6.Task6_9.Main.
     Инициализирует фон панели и загружает выбранное изображение.
     imagePath путь к выбранному изображению
     */
    public Main(String imagePath) {
        setBackground(Color.WHITE);
        image = Toolkit.getDefaultToolkit().getImage(imagePath);// Загрузка изображения с помощью Toolkit
    }


    //Метод paintComponent отрисовывает компонент. В данном случае он рисует изображение на панели.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);// Рисование изображения на панели
    }


    //Метод main создает экземпляр класса pr6.Task6_9.Main и добавляет его на главное окно приложения.
    //
    //Также он устанавливает размер и местоположение окна.
    public static void main(String[] args) {
        // Проверка наличия пути к изображению в аргументах командной строки
        if (args.length < 1) {
            System.err.println("Usage: java pr6.Task6_9.Main <image_path>");
            System.exit(1);
        }

        JFrame frame = new JFrame("Image Viewer");// Создание главного окна приложения
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Main panel = new Main(args[0]);// Создание панели pr6.Task6_9.Main и добавление ее на главное окно

        frame.add(panel);

        frame.setVisible(true);// Отображение главного окна

    }
}