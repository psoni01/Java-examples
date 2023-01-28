
import java.util.ArrayList;

public class CarbonFootprintTest {

    public static void main(String[] args) {
        Building building = new Building(10);
        Car car = new Car(400, 90);
        Bicycle bicycle = new Bicycle("xyz", 2);
        ArrayList<CarbonFootprint> obj = new ArrayList<>();

        obj.add(building);
        obj.add(car);
        obj.add(bicycle);

        obj.forEach((obj1) -> {
            obj1.getCarbonFootprint();
        });

    }
}
