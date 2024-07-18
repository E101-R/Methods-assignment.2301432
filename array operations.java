

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize an array to store 15 integers
        int[] numbers = new int[15];
        
        // Ask user to input 15 integers
        System.out.println("Please enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Part (a): Print the values stored in the array
        System.out.println("\nValues stored in the array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Part (b): Check if a user-entered number is present in the array
        System.out.print("\nEnter a number to check if it is present in the array: ");
        int numberToCheck = scanner.nextInt();
        boolean numberFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToCheck) {
                System.out.println("The number " + numberToCheck + " is found at index " + i);
                numberFound = true;
                break;
            }
        }
        if (!numberFound) {
            System.out.println("Number not found in this array.");
        }
        
        // Part (c): Create a new array and copy elements in reverse order
        int[] reversedArray = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        
        // Print the elements of the new array
        System.out.println("\nElements of the new array in reverse order:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Part (d): Calculate the sum and product of all elements in the array
        int sum = 0;
        int product = 1;
        for (int num : numbers) {
            sum += num;
            product *= num;
        }
        
        // Print the sum and product of the elements
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
        
        // Close the scanner
        scanner.close();
    }
}
