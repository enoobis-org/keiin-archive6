public class Rectangle extends Shape implements Drawable{
    private double width;
    private double height;

    public Rectangle(int i, int i1) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        double s = width * height;
    }

    @Override
    public void draw() {
        System.out.println("Рисуется фигура Rectangle");
    }
}
