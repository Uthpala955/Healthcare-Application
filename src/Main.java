import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your marks: ");
        Scanner sc =new Scanner(System.in );
        int userScore = sc.nextInt();

        if (userScore <= 100 && userScore >=0 ) {
            if (userScore >= 90) {
                System.out.println("your Grade is A.");

            } else if (userScore >= 80) {
                System.out.println("your Grade is B.");
            } else if (userScore >= 70) {
                System.out.println("your Grade is C.");
            } else if (userScore >= 60) {
                System.out.println("your Grade is B.");
            } else if (userScore < 60) {
                System.out.println("you are Failed.");
            }
        }
        else {
            System.out.println("Invalid Input Entered. ");
        }
    }

}

