import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination){
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.capacity = 5;
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        this.passengers.add(person);
    }

    public boolean addPassengerIfCapacity(Person person){
        if (this.passengerCount() <= this.capacity){
            this.passengers.add(person);
            return true;
        }else{
            return false;
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }


}



