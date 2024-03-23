import java.util.Scanner;

public class Main {

    public static String calculateAgeCategory(int age) {
        if (age < 0) {
            return "Invalid";
        } else if ( age <= 12) {
            return "Child";
        } else if ( age <= 19) {
            return "Teenager";
        } else if ( age <= 59) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputAge = scanner.nextInt();

        String res = calculateAgeCategory(inputAge);
        System.out.println(res);

        scanner.close();
    }
}