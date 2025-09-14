
public class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.4f\n", area);
    public void displayCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of Circle: %.4f\n", circumference);}
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        circle.displayArea();
        circle.displayCircumference();
    }
}