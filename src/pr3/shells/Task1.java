package pr3.shells;

public class Task1 {
    public static void main(String[] args) {
        // 1. Создание объектов класса Double с использованием метода valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.71828");

        // 2. Преобразование значения типа String к типу double с использованием метода parseDouble()
        String strValue = "5.678";
        double doubleValue = Double.parseDouble(strValue);

        // 3. Преобразование объекта Double к примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj2.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj2.longValue();

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение объекта doubleObj1: " + doubleObj1);
        System.out.println("Значение объекта doubleObj2: " + doubleObj2);

        // 5. Преобразование литерала типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Значение строки d: " + d);
    }
}
