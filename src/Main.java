public class Main {
    public static void main(String[] args) {
        Shapes[] shapes = {new Triangle(2, 6),
                new Rectangle(2, 6),
                new Circle(2),
                new Square(2, 6)};
        for (Shapes s:shapes) {
            System.out.println(s.toString() + "\n");
        }
    }
}