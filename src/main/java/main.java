public class main {
    public static void main(String[] args) {
        Shape s =new Shape("green",true);
        System.out.println(s.toString());

        Circle c = new Circle(s.getColor(),s.isFilled(),7);
        System.out.println(c.toString());

        Rectangle r = new Rectangle(1.0,1.0,"green",true);
        System.out.println(r.toString());

        Square sq = new Square(1.0,"green",true);
        System.out.println(sq.toString());
    }
}
