import java.util.Objects;

public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double calculatePerimeter(){
        return 2*3.14*radius;

    }
    public double calculateArea(){
        return 3.14*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
    public void draw(){
        System.out.println("shape is " + this.getClass().getName()+"\n" + "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea());
    }

    @Override
    public String toString() {
        return "shape is " + this.getClass().getName()+ "," + "radius: " + radius + ", "+ "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea() ;
    }
}
