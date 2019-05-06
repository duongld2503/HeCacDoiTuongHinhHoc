public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius){
        double area = radius*radius*Math.PI;
        return area;
    }

    public double getPerimeter(double radius){
        double perimeter = radius*Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return getColor()+" "+isFilled()+" "+super.toString();
    }
}
