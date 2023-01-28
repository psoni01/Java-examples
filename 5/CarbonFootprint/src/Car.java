/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Car implements CarbonFootprint {

    int horsePower;
    int speed;

    Car(int hp, int speed) {
        horsePower = hp;
        this.speed = speed;
    }
    
    public int gasConsumption() {
        return horsePower * speed;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.printf("Car with %d horsepower has carbon footprint of %d%n", horsePower, (int) (gasConsumption() * 0.003));
    }

}
