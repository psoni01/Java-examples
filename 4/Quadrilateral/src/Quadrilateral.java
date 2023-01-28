
public class Quadrilateral {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    

    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        point4 = p4;

    }

    void setPoint1(Point p) {
        point1 = p;
    }

    void setPoint2(Point p) {
        point2 = p;
    }

    void setPoint3(Point p) {
        point3 = p;
    }

    void setPoint4(Point p) {
        point4 = p;
    }

    Point getPoint1() {
        return point1;
    }

    Point getPoint2() {
        return point2;
    }

    Point getPoint3() {
        return point3;
    }

    Point getPoint4() {
        return point4;
    }

    public float getArea() {
        float a1 = (point1.x * point2.y) - (point1.y * point2.x);
        float a2 = (point2.x * point3.y) - (point2.y * point3.x);
        float a3 = (point3.x * point4.y) - (point3.y * point4.x);
        float a4 = (point4.x * point1.y) - (point4.y * point1.x);
        float a = (a1 + a2 + a3 + a4);
        a = Math.abs(a);
        return (a / 2);
        
    }
    
    public void displayArea() {
        
    }
}
