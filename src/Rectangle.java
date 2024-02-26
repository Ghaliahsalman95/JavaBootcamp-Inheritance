public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        width=1.0;
        length=1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return width*length;
}
    @Override
    public double getPerimeter(){
        return (width+length)*2;
    }


    @Override
    public String toString() {
        return "Rectangle[" +"width=" + width + " length=" + length +
                "]";//+super.toString();iif we want color and filled
    }
}
