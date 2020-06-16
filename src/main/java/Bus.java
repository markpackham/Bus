import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> people;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.people = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.people.size();
    }

    public void addPassenger(Person person) {

        if(this.capacity > passengerCount() ){
            this.people.add(person);
        }
    }

    public void removePassenger(){
        people.remove(0);
    }
}
