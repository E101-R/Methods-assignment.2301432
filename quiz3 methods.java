
public class TriangleAreaCalculator {
    private double base;
    private double height;
    private double area;

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.enterBaseAndHeight();
        calculator.computeArea();
        calculator.displayArea();
    }

    // Method to ask the user to enter the base and height of a triangle
    public void enterBaseAndHeight() {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter the base
        System.out.println("Enter the base of the triangle:");
        base = scanner.nextDouble();

        // Asking user to enter the height
        System.out.println("Enter the height of the triangle:");
        height = scanner.nextDouble();

        scanner.close();
    }

    // Method to compute the area of the triangle
    public void computeArea() {
        area = 0.5 * base * height;
    }

    // Method to output the calculated area of the triangle and display it to the user
    public void displayArea() {
        System.out.println("The area of the triangle is: " + area);
    }
}
