//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome Exercise (inheritance)!");
        Circle circle=new Circle("Red",true,1);
        Rectangle rectangle=new Rectangle("Yellow",true,2,2);
        Square square=new Square("Green",true,5,5);
        System.out.println("Circle \t its color is: "+circle.getColor()
               +"\t Is it filled ?"+circle.isFilled() +"\t Area is :"+circle.getArea()
                +" \t Perimeter is "+circle.getPerimeter());
        System.out.println("-------------------------------------------\nToString Circle");
        System.out.println(circle.toString());
        System.out.println("Rectangle \t its color is: "+rectangle.getColor()
                +"\t Is it filled ?"+rectangle.isFilled() +"\t Area is :"+rectangle.getArea()
                +" \t Perimeter is "+rectangle.getPerimeter());
        System.out.println("-------------------------------------------\n");
        System.out.println("-------------------------------------------\nToString Rectangle");
        System.out.println(rectangle.toString());
        System.out.println("-------------------------------------------\n");

        System.out.println("Square \t its color is: "+square.getColor()
                +"\t Is it filled ?"+square.isFilled() +"\t Area is :"+square.getArea()
                +" \t Perimeter is "+square.getPerimeter());
        System.out.println("-------------------------------------------\n ToString Square");
        System.out.println(square.toString());

    }

}