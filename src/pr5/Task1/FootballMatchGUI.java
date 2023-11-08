package pr5.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchGUI extends JFrame {

    private JLabel resultLabel; // для вывода результата игры
    private JLabel scorerLabel; // для вывода последнего забившего
    private JLabel winnerLabel; // для вывода победителя
    private int milanScore; // счет команды AC Milan
    private int madridScore; // счет команды Real Madrid

    // создаем конструктор класса
    public FootballMatchGUI() {
        super("Football Match"); // вызываем конструктор суперкласса и передаем ему заголовок окна

        milanScore = 0; // инициализируем счет команды AC Milan
        madridScore = 0; // инициализируем счет команды Real Madrid

        // создаем кнопки и метки
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        scorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        // добавляем обработчики событий для кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // увеличиваем счет команды AC Milan
                updateResultLabel(); // обновляем метку с результатом игры
                scorerLabel.setText("Last Scorer: AC Milan"); // обновляем метку с последним забившим
                updateWinnerLabel(); // обновляем метку с победителем
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // увеличиваем счет команды Real Madrid
                updateResultLabel(); // обновляем метку с результатом игры
                scorerLabel.setText("Last Scorer: Real Madrid"); // обновляем метку с последним забившим
                updateWinnerLabel(); // обновляем метку с победителем
            }
        });

        // устанавливаем менеджер компоновки и добавляем кнопки и метки на форму
        setLayout(new FlowLayout());
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(scorerLabel);
        add(winnerLabel);

        setSize(300, 200); // устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // устанавливаем действие при закрытии окна
        setVisible(true); // делаем окно видимым
    }

    // метод для обновления метки с результатом игры
    private void updateResultLabel() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore); // формируем текст метки
    }

    // метод для обновления метки с победителем
    private void updateWinnerLabel() {
        if (milanScore > madridScore) { // если команда AC Milan набрала больше очков
            winnerLabel.setText("Winner: AC Milan"); // выводим, что победил AC Milan
        } else if (milanScore < madridScore) { // если команда Real Madrid набрала больше очков
            winnerLabel.setText("Winner: Real Madrid"); // выводим, что победил Real Madrid
        } else { // если набрано одинаковое количество очков
            winnerLabel.setText("Winner: DRAW"); // выводим, что ничья
        }
    }

    // метод main для запуска программы
    public static void main(String[] args) {
        new FootballMatchGUI(); // создаем объект класса FootballMatchGUI
    }
}