/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Building implements CarbonFootprint {

    int numOfFloors;

    Building(int a) {
        numOfFloors = a;
    }

    public int getNumOfHouse() {
        return numOfFloors * 4;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.printf("Building with %d floors has carbon footprint of %d%n",numOfFloors, getNumOfHouse() * 40);
    }
}
