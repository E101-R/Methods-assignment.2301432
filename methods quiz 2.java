

public class methods {
    
    public static void main(String[] args) {
        enterMarksAndComputeAverage();
    }

    public static void enterMarksAndComputeAverage() {
        Scanner scanner = new Scanner(System.in);

        // Asking lecturer to enter marks for three units
        System.out.println("Enter marks for Java Programming:");
        double javaMarks = scanner.nextDouble();

        System.out.println("Enter marks for Networking:");
        double networkingMarks = scanner.nextDouble();

        System.out.println("Enter marks for Maths:");
        double mathsMarks = scanner.nextDouble();

        // Compute the average marks for three units
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Display the results in the specified format
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);

        scanner.close();
    }
}
