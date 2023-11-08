package pr5.Task2;

import java.awt.*;

//Класс Square представляет квадрат
//
//Наследует абстрактный класс Shape
class Square extends Shape {
    private int side; // дополнительный параметр - длина стороны квадрата

    //Конструктор класса
    public Square(Color color, Point position, int side) {
        super(color, position);
        this.side = side;
    }

    //Метод для рисования квадрата
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x - side / 2, position.y - side / 2, side, side);
    }
}