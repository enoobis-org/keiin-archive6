public class Main {
    public static void main(String[] args) {
        Shape[] a = new Shape{new Circle(43.3), new Rectangle(23, 45)};
        for(Shape shape: a){
            shape.draw();
        }
    }
}