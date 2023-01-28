
public class Trapezoid extends Quadrilateral {

    Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }
    

    public void displayArea() {
        System.out.printf("Trapezoid area is %f%n", super.getArea());
        
    }
}
