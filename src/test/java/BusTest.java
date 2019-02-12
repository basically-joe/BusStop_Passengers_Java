import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

   @Before
   public void before(){
       bus = new Bus("Glasgow");
       person = new Person();
   }

    @Test
    public void emptyBus(){
        assertEquals(0, bus.passengerCount());
    }


    @Test
          public void addPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }


    @Test
    public void addPassengerIfCapacity(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
//        bus.addPassenger(person);
        assertEquals(true, bus.addPassengerIfCapacity(person));
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void removePas(){
       bus.addPassenger(person);
       bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
        bus.removePassenger();
        assertEquals(1, bus.passengerCount());
   }

}

