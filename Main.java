import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import Dealership.DealerShip;
import Vehicles.*;
import People.*;
import Threads.DealerThread;
import Threads.PersonThread;

public class Main {
    public static void main(String[] args) throws Exception {  
        Vector<Person> people = new Vector<Person>();

        DealerThread storeThread = new DealerThread();
        PersonThread peopleThread = new PersonThread();

        DealerShip store = new DealerShip();
        while(true) {
            
            storeThread.run(store, 10);
            
            peopleThread.run(people);

            storeThread.join();
            peopleThread.join();

            VehicleBase vehicle;

            for (int i = 0; i < people.size(); i++) {
                Person curr = people.get(i);
                if ((vehicle = curr.buy(store)) == null) {
                    System.out.println(curr.getName() + " didn't buy anything " + curr.getPreferredCondition() + " " + curr.getPreferredType());
                    continue ;
                }

                System.out.print(curr.getName() + " bought a ");
                vehicle.print();

                people.remove(i);
                i--;
            } 
        }
    }
}
