import java.util.ArrayList;
import java.util.Objects;

public class Triangle {
    private ArrayList<Integer> sides;
    public Triangle(int s1,int s2,int s3){
        sides = new ArrayList<>();
        if(s1+s2>s3 && s2+s3>s1 && s1+s3>s2) {
            sides.add(s1);
            sides.add(s2);
            sides.add(s3);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
    public double calculateArea(){
         double p = calculatePerimeter()/2;
         p = p * (p-sides.get(0)) * (p-sides.get(1)) * (p-sides.get(2));
         return Math.sqrt(p);



    }
    public double calculatePerimeter(){
        double s = 0;
        for (Integer side : sides){
            s += side;
        }
        return s;

    }
    public ArrayList<Integer> getSides(){
        return sides;
    }
    @Override
    public String toString() {
        return "shape is: " + this.getClass().getName() + "," + "sides: " + "["+ sides.get(0)+ "," + sides.get(1) + "," + sides.get(2)+ "] " + "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea();
    }
    public void draw(){
        System.out.println("shape is " + this.getClass().getName()+"\n" + "perimeter: " + calculatePerimeter() +"," +"Area: " + calculateArea());
    }
    public boolean isEquilateral(){
        if(sides.get(0).equals(sides.get(1))){
            if(sides.get(0).equals(sides.get(2))){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}
