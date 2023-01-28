/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class QuadrilateralTest {

    public static void main(String[] args) {

        Point trapezoidP1 = new Point(6, 10);
        Point trapezoidP2 = new Point(12, 28);
        Point trapezoidP3 = new Point(34, 28);
        Point trapezoidP4 = new Point(55, 10);

        Point parallelogramP1 = new Point(6, 7);
        Point parallelogramP2 = new Point(18, 26);
        Point parallelogramP3 = new Point(48, 26);
        Point parallelogramP4 = new Point(36, 7);

        Point rectangleP1 = new Point(8, 20);
        Point rectangleP2 = new Point(16, 34);
        Point rectangleP3 = new Point(47, 16);
        Point rectangleP4 = new Point(39, 2);

        Point squareP1 = new Point(7, 4);
        Point squareP2 = new Point(7, 26);
        Point squareP3 = new Point(29, 26);
        Point squareP4 = new Point(29, 4);

        Trapezoid trap = new Trapezoid(trapezoidP1, trapezoidP2, trapezoidP3, trapezoidP4);

        Parallelogram para = new Parallelogram(parallelogramP1, parallelogramP2, parallelogramP3, parallelogramP4);

        Rectangle rect = new Rectangle(rectangleP1, rectangleP2, rectangleP3, rectangleP4);

        Square squa = new Square(squareP1, squareP2, squareP3, squareP4);

        Quadrilateral[] obj = new Quadrilateral[4];
        obj[0] = trap;
        obj[1] = para;
        obj[2] = rect;
        obj[3] = squa;

        for (Quadrilateral obj1 : obj) {
            obj1.displayArea();
        }

    }
}
