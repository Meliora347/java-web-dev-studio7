package org.launchcode.studio7;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
            CD cd= new CD("No Doubt", 600, 300);
            DVD dvd = new DVD("Finding Nemo", 1200, 1000);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();
        System.out.println(dvd.getName());
    }
}
