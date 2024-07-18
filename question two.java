

public class PalindromeChecker {
    
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setSize(400, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the program when the window is closed

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel); // Method to place components in the panel

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Set layout to null to manually place components

        // Create a label to prompt user to enter a number
        JLabel userLabel = new JLabel("Enter a number:");
        userLabel.setBounds(10, 20, 120, 25); // Set position and size of the label
        panel.add(userLabel); // Add label to panel

        // Create a text field for user input
        JTextField userText = new JTextField(20);
        userText.setBounds(140, 20, 165, 25); // Set position and size of the text field
        panel.add(userText); // Add text field to panel

        // Create a button for checking palindrome
        JButton checkButton = new JButton("Check");
        checkButton.setBounds(10, 80, 150, 25); // Set position and size of the button
        panel.add(checkButton); // Add button to panel

        // Create a label to display the result
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 120, 300, 25); // Set position and size of the label
        panel.add(resultLabel); // Add label to panel

        // Add action listener to the button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the input number as a string
                String input = userText.getText();
                // Check if the input is a palindrome
                boolean isPalindrome = isPalindrome(input);
                // Display the result
                if (isPalindrome) {
                    resultLabel.setText(input + " is a palindrome.");
                } else {
                    resultLabel.setText(input + " is not a palindrome.");
                }
            }
        });
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int length = str.length(); // Get the length of the string
        for (int i = 0; i < length / 2; i++) {
            // Compare characters from the beginning and end of the string
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // If any characters don't match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
