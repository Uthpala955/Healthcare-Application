import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Boolean mainMenu = true;
        while (mainMenu) {
            System.out.println("If you are hospital administator please press 1 , if you are patient please press 2 and Press 3 to exit. ");

            int userInput = sc.nextInt();

            if (userInput == 1) {
                Boolean Administrator = true;
                while (Administrator) {
                    System.out.println("Press 01 tp add a doctor , press 02 to add aa  doctor availability ,press 03 to exit. ");
                    int userobj = sc.nextInt();
                    if (userobj == 1) {
                        System.out.println("Add a doctor: ");
                    } else if (userobj == 2) {
                        System.out.println("Add a doctor availability: ");
                    } else if (userobj == 3) {
                        Administrator = false;
                        System.out.println("Exit");
                    } else {
                        System.out.println("Invaild Input.");
                    }
                }

            } else if (userInput == 2) {
                boolean patient = true;
                while (patient) {
                    System.out.println("Press 01 to view doctors , press 02 to book an appointment ,pree 03 to view a selected doctor's bookings and press 4 to exit. ");
                    int userobj = sc.nextInt();
                    if (userobj == 1) {
                        System.out.println("View doctors: ");
                    } else if (userobj == 2) {
                        System.out.println("Book an appointment: ");
                    } else if (userobj == 3) {
                        System.out.println("view a selected doctor's bookings: ");
                    } else if (userobj == 4) {
                        patient = false;
                        System.out.println("Exit");
                    } else {
                        System.out.println("Invaild Input.");
                    }
                }

            } else if (userInput == 3) {
                mainMenu = false;
                System.out.println("Exit");
            }

            else {
                System.out.println("Invaild Input.");
            }
        }
    }
}



