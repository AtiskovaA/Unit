import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> turnAttraction = new LinkedList<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            turnAttraction.offer(person);
        }

        while (!turnAttraction.isEmpty()){
            Person person = turnAttraction.poll();
            System.out.println("Клиент " + person.getName() + " прокатился");
            person.reduceTicket();
            if(person.moreTickets()){
                turnAttraction.offer(person);
            }
        }
    }

    public static List <Person> generateClients(){
        List <Person> turn = new ArrayList<>();
        turn.add(new Person("Anna", "Popova", 5));
        turn.add(new Person("Ira", "Kovaleva", 2));
        turn.add(new Person("Pavel", "Ivanov", 5));
        turn.add(new Person("Igor", "Kataev", 3));
        turn.add(new Person("Poll", "Lem", 4));
        return turn;
    }
}
