public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double s = Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуется фигура Circle");
    }
}
