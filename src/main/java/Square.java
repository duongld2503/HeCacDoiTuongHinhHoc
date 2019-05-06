public class Square extends Rectangle {
    private double side;

    //constructor
    public Square(){
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
        this.side = side;
    }

    //getset

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side:"
                +getSide()
                +"is a subclass of rectangle"
                +super.toString();
    }
}
