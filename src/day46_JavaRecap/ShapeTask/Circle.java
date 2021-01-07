package day46_JavaRecap.ShapeTask;

public class Circle extends shape{

    private final static double PI = 3.14; //internal use only, so I make it private
    public double r, d;

    public Circle(double r) {

        super("Circle");
        if(r <= 0){ // if radius of circle is invalid
            throw new RuntimeException("No Such a Circle with a Radius Of "+r);
        }
        this.r = r;
        this.d = r * 2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='"+name+'\''+
                ", area="+ area()+" square cm"+
                ", perimeter="+perimeter()+" cm"+
                ", r=" + r +
                ", d=" + d +
                '}';
    }
}

/*
    2. create a class called Circle
                Attributes: name, r, d, PI
                Add a constructor that can set the instances of the Circle:
                        if the radius of the circle is 0 or negative, throw an exception with a message of: "No Such a Circle with a radius of: r"  replace the r with given radius
                methods:
                    area(): returns the area of the circle
                    perimeter(): returns the perimeter of the circle
 */
