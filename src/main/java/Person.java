public class Person {
    protected String name;
    protected String surname;
    protected int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;
    }

    public void reduceTicket(){
        tickets--;
    }
    public boolean moreTickets(){
        return tickets > 0;
    }
}
