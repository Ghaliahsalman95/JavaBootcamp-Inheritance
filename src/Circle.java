public class Circle extends Shape{
private double radius;

    public Circle() {
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.pow(radius,2)*3.14;
    }
    @Override
    public double getPerimeter(){
        return radius*2*3.14;
    }

    @Override
    public String toString() {
        return  "Circle [" +"radius=" + radius + "]";//+super.toString();if we want color and filled
    }
}
