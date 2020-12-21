package day44_Inheritance.ShapesTask;

import java.awt.*;


    public class Circle extends Shape {
    /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
     */

        public double radius, diameter;
        public final static double PI;

        static{
            PI = 3.14;
        }

        public Circle(double radius){
            setInfo("Circle");
            this.radius = radius;
            diameter = this.radius * 2;
        }


        public double calcArea(){
            return radius * radius * PI;
        }

        public double calcPerimeter(){
            return diameter * PI ;
        }



    }

