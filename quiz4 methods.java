

public class MixedMethodsDemo {
    private int instanceVariable;

    // Constructor
    public MixedMethodsDemo(int value) {
        this.instanceVariable = value;
    }

    // Non-static method
    public void showInstanceVariable() {
        System.out.println("Instance Variable value: " + this.instanceVariable);
    }

    // Static method 1
    public static void displayMessage() {
        System.out.println("Hello from a static method!");
    }

    // Static method 2
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create an instance of MixedMethodsDemo using the constructor
        MixedMethodsDemo demo = new MixedMethodsDemo(10);

        // Call the non-static method
        demo.showInstanceVariable();

        // Call the static methods
        MixedMethodsDemo.displayMessage();
        int result = MixedMethodsDemo.addNumbers(5, 7);
        System.out.println("The sum is: " + result);
    }
}
