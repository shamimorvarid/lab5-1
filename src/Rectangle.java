import java.util.ArrayList;
import java.util.Objects;

public class Rectangle {
    private ArrayList<Integer> sides;
    public Rectangle(int a,int b){
        sides = new ArrayList<>();
        sides.add(a);
        sides.add(b);
    }
    public ArrayList<Integer> getSides(){
        return  sides;
    }
    public double calculatePerimeter(){
        double p = 0;
        for(Integer side : sides){
            p += 2*(side);
        }
        return p;
    }
    public double calculateArea(){
        double s = 1;
        for(Integer side : sides){
            s *= side;
        }
        return s;
    }
    public void draw(){
        System.out.println("shape is " + this.getClass().getName()+"\n" + "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
    @Override
    public String toString() {
        return "shape is: " + this.getClass().getName() + "," + "sides: " +"["+ sides.get(0)+ "," + sides.get(1) + "] "+ "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea();
    }
    public boolean isSquare(){
        if(sides.get(0).equals(sides.get(1)))
            return true;
        else
            return false;
    }
}
