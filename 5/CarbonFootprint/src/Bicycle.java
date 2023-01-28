/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Bicycle implements CarbonFootprint {

    String brand;
    int seats;

    Bicycle(String brand, int seats) {
        this.brand = brand;
        this.seats = seats;
    }

    public void addSeat() {
        seats++;
    }

    @Override
    public void getCarbonFootprint() {
        if (brand.equals("xyz")) {
            System.out.printf("Bicycle of %s brand with %d seat/s has carbon footprint of %d%n", brand, seats, 50);
        } else {
            System.out.printf("Bicycle of %s brand with %d seat/s has carbon footprint of %d%n", brand, seats, 30);
        }
    }

}
