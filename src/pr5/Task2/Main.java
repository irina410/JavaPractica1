package pr5.Task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int SHAPE_COUNT = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_SIDE = 100;

    private Shape[] shapes;

    public Main() {
        setBackground(Color.WHITE);

        shapes = new Shape[SHAPE_COUNT];
        Random random = new Random();
        for (int i = 0; i < SHAPE_COUNT; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            Point position = new Point(random.nextInt(WIDTH), random.nextInt(HEIGHT));
            int type = random.nextInt(3);
            if (type == 0) {
                int radius = random.nextInt(MAX_RADIUS) + 1;
                shapes[i] = new Circle(color, position, radius);
            } else if (type == 1) {
                int side = random.nextInt(MAX_SIDE) + 1;
                shapes[i] = new Square(color, position, side);
            } else {
                int side = random.nextInt(MAX_SIDE) + 1;
                shapes[i] = new Triangle(color, position, side);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Main panel = new Main();
        frame.add(panel);

        frame.setVisible(true);
    }
}