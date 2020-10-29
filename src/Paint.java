import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    public Paint(){
        triangles = new ArrayList<>();
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }
    public void addTriangle(Triangle trg){
        triangles.add(trg);
    }
    public void addCircle(Circle crl){
        circles.add(crl);
    }
    public void addRectangle(Rectangle rec){
        rectangles.add(rec);
    }
    public void drawAll(){
        for (Triangle tr : triangles)
            tr.draw();
        for (Circle cr : circles)
            cr.draw();
        for (Rectangle rec : rectangles)
            rec.draw();
    }
    public void printAll(){
        for (Triangle tr : triangles)
            System.out.println(tr.toString());
        for (Circle cr : circles)
            System.out.println(cr.toString());
        for (Rectangle rec : rectangles)
            System.out.println(rec.toString());

    }

}
