package pr5.Task2;

import java.awt.*;

// Абстрактный класс Shape представляет геометрическую фигуру
abstract class Shape {
    protected Color color; // Цвет фигуры
    protected Point position; // Положение фигуры в координатах

    // Конструктор класса Shape, принимающий цвет и положение
    public Shape(Color color, Point position) {
        this.color = color;
        this.position = position;
    }

    // Абстрактный метод draw, который должен быть реализован в подклассах
    public abstract void draw(Graphics g);
}
