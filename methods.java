

public class methods {
    
    public static void main(String[] args) {
        findLargestAndSmallest();
    }

    public static void findLargestAndSmallest() {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter three numbers
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        // Determine the largest and smallest numbers using if statements
        int largest = number1;
        int smallest = number1;

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Display the results in the specified format
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is your smallest number.");
        
        scanner.close();
    }
}
