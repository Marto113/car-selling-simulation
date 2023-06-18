import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

import Dealership.DealerShip;
import Vehicles.*;
import People.*;

public class Main {
    public static void main(String[] args) throws Exception {  

        DealerShip store = new DealerShip();
        int i = 0;
        while(true) {
            store.makeVehicle();
            i++;
            if(i == 50){
                break;
            }
            
        }
        store.print();

    }
}
