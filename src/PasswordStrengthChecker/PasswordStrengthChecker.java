import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int strength = checkPasswordStrength(password);

        System.out.println("Password Strength: " + getStrengthLevel(strength));
    }

    public static int checkPasswordStrength(String password) {
        int strength = 0;

        // Check length
        if (password.length() >= 8) {
            strength++;
        }

        // Check for digits
        if (password.matches(".*\\d.*")) {
            strength++;
        }

        // Check for lowercase letters
        if (password.matches(".*[a-z].*")) {
            strength++;
        }

        // Check for uppercase letters
        if (password.matches(".*[A-Z].*")) {
            strength++;
        }

        // Check for special characters
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            strength++;
        }

        return strength;
    }

    public static String getStrengthLevel(int strength) {
        switch (strength) {
            case 0:
            case 1: return "Very Weak";
            case 2: return "Weak";
            case 3: return "Medium";
            case 4: return "Strong";
            case 5: return "Very Strong";
            default: return "Undefined";
        }
    }
}
