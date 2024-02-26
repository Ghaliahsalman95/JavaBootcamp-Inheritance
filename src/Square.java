public class Square extends Rectangle{
    public Square() {
    }


    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square(double side) {
        super.setLength(side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return Math.pow(super.getLength(),2);
    }

    @Override
    public double getPerimeter() {
        return super.getLength()*4;
    }

    @Override
    public String toString() {
        return "Square Side is:"+super.getLength();////+super.toString();iif we want color and filled
    }
}
