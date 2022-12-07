import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование: Person")
class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Pavel", "Ivanov", 5);
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @Test
    @DisplayName("Тест проверяет имя (name)")
    void getName() {
        assertEquals("Pavel", person.getName());
        System.out.println("Тест выполнен");
    }

    @Test
    @DisplayName("Тест проверяет фамилию (surname)")
    void getSurname() {
        assertEquals("Ivanov", person.getSurname());
        System.out.println("Тест выполнен");
    }

    @Test
    @DisplayName("Тест проверяет количество билетов (tickets)")
    void getTickets() {
        assertEquals(5, person.getTickets());
        System.out.println("Тест выполнен");
    }

    @Test
    @DisplayName("Тест на проверку уменьшения билетов (tickets)")
    void reduceTicket() {
        person.reduceTicket();
        assertEquals(4, person.getTickets());
        System.out.println("Тест выполнен");
    }
}




