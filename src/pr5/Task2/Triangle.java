package pr5.Task2;

import java.awt.*;

//Класс, представляющий треугольник
//
//Наследуется от абстрактного класса Shape
class Triangle extends Shape {
    private int side; // дополнительный параметр - длина стороны треугольника

//Конструктор класса Triangle
    public Triangle(Color color, Point position, int side) {
        super(color, position);
        this.side = side;
    }

    //Метод рисования треугольника, g графический контекст
    public void draw(Graphics g) {
        g.setColor(color);// Устанавливаем цвет треугольника
        // Вычисляем координаты вершин треугольника
        int[] xPoints = {position.x, position.x - side / 2, position.x + side / 2};
        int[] yPoints = {position.y - side / 2, position.y + side / 2, position.y + side / 2};
        g.fillPolygon(xPoints, yPoints, 3);// Заполняем треугольник заданным цветом
    }
}