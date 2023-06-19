package Threads;

import Dealership.DealerShip;

public class DealerThread extends Thread {
    @Override
    public void run() {
        
    }

    public void run(DealerShip dealerShip, int count) {
        for (int i = 0; i < count; i++) {
            dealerShip.makeVehicle();
        }
    }
    
}
