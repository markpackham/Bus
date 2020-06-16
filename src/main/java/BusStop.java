import java.util.ArrayList;

public class BusStop{
    private ArrayList<Person> queue;

    public BusStop(){
        this.queue = new ArrayList<Person>();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public int getQueueSize() {
        return queue.size();
    }
}