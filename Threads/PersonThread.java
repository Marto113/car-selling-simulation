package Threads;

import java.util.Vector;

import People.Person;

public class PersonThread extends Thread {
    @Override
    public void run() {
        
    }

    public void run(Vector<Person> people) {
        //ne
        people.add(new Person());
    }
}
