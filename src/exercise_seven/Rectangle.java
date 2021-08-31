package exercise_seven;

public class Rectangle {

    private double length;
    private double width;


    public Rectangle(double length, double width) throws Exception {
        setLength(length);
        setLength(width);
    }

    public Rectangle() throws Exception {
        this(1.0, 1.0);
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * width + 2 * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws Exception {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new Exception("Length must be greater than 0.0 and less than 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws Exception {
        if (length > 0.0 && length < 20.0) {
            this.width = width;
        } else {
            throw new Exception("Width must be greater than 0.0 and less than 20.0");
        }

    }

    public static void main(String[] args) throws Exception {

        Rectangle rectangle = new Rectangle(4.9, 19);
        System.out.printf("Rectangle length: %2f%n", rectangle.getLength());
        System.out.printf("Rectangle width: %2f%n", rectangle.getWidth());
        System.out.printf("Rectangle perimeter: %2f%n", rectangle.perimeter());
        System.out.printf("Rectangle area is: %2f%n", rectangle.area());

        Rectangle rectangle2 = new Rectangle(23, 19); // An exception is thrown over here
    }
    // Program running
    /*
     * Rectangle length: 19,000000
     * Rectangle width: 0,000000
     * Rectangle perimeter: 38,000000
     * Rectangle area is: 0,000000
     * Exception in thread "main" java.lang.Exception: Length must be greater than 0.0 and less than 20.0
	 * at exercise_seven.Rectangle.setLength(Rectangle.java:40)
	 * at exercise_seven.Rectangle.<init>(Rectangle.java:16)
	 * at exercise_seven.Rectangle.main(Rectangle.java:65)
     */
}
