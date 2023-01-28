
public class Rectangle extends Parallelogram {
    Rectangle (Point p1,Point p2,Point p3,Point p4) {
        super(p1,p2,p3,p4);
        
    }
    @Override
    public void displayArea() {
        System.out.printf("Rectangle area is %f%n", super.getArea());
        
    }
}
