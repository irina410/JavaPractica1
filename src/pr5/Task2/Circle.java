package pr5.Task2;

import java.awt.*;

//Класс Circle представляет круг
//
//Он наследует от класса Shape и содержит дополнительное свойство - радиус
class Circle extends Shape {
    private int radius;

    //Конструктор класса
    public Circle(Color color, Point position, int radius) {
        super(color, position);
        this.radius = radius;
    }

    //Метод для отрисовки круга.
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
    }
}