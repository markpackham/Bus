import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Person person;

    @Before
    public void before() {
        busStop = new BusStop();
        person = new Person();
    }

    @Test
    public void checkQueueSize(){
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void addPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void removePersonQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePerson();
        assertEquals(0, busStop.getQueueSize());
    }
}