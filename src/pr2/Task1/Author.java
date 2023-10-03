package pr2.Task1;


public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override

    // Метод toString() с аннотацией @Override в классе Author переопределяет метод toString(),
    // который всегда находится в класcе Object, суперклассе всех классов в Java.
    //Все классы в Java по умолчанию наследуются от класса Object, и одним из методов,
    // которые они наследуют, является toString(). Этот метод обычно используется для получения
    // строкового представления объекта. По умолчанию toString() возвращает строку,
    // которая состоит из имени класса, символа @ и шестнадцатеричного представления хэш-кода объекта.

    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}