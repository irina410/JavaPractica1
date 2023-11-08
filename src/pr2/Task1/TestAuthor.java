package pr2.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pr2.Task1.Author;

import static org.junit.Assert.assertEquals;


//Метод assertEquals в Java используется для сравнения ожидаемого значения
// с фактическим значением в тестовом фреймворке JUnit. Он проверяет,
// совпадают ли значения, и, в случае несовпадения, выводит сообщение об ошибке с указанием деталей.
//Аннотация @Test в Java используется для обозначения метода как тестового в JUnit-тестах

public class TestAuthor {

    @Test
    public void testGetName() {
        Author author = new Author("John Doe", "johndoe@example.com", 'M');
        Assertions.assertEquals("John Doe", author.getName());
    }

    @Test
    public void testGetEmail() {
        Author author = new Author("Jane Smith", "janesmith@example.com", 'F');
        Assertions.assertEquals("janesmith@example.com", author.getEmail());
    }

    @Test
    public void testSetEmail() {
        Author author = new Author("Alice Johnson", "alice@example.com", 'F');
        author.setEmail("newemail@example.com");
        Assertions.assertEquals("newemail@example.com", author.getEmail());
    }

    @Test
    public void testGetGender() {
        Author author = new Author("Bob Brown", "bob@example.com", 'M');
        Assertions.assertEquals('M', author.getGender());
    }

    @Test
    public void testToString() {
        Author author = new Author("Eve Adams", "eve@example.com", 'F');
        Assertions.assertEquals("Author [name=Eve Adams, email=eve@example.com, gender=F]", author.toString());
    }
}