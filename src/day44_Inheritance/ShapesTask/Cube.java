package day44_Inheritance.ShapesTask;

import java.awt.*;

    public class Cube extends Shape {

        public double side;

        public Cube(double side) {
            this.side = side;
            setInfo("Cube");
        }

        @Override
        public double calcArea() {
            //   Square square = new Square(side); // one square of the cube
            //   double area = square.calcArea(); // are of one square
            return  side * side * 6 ;
        }

        @Override
        public double calcPerimeter() {
            return side * 12;
        }
}
