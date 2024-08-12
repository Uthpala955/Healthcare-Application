import java.util.Scanner;

public class Main {
    Controller controller = new Controller();

    public static void adminMenu() {

        Boolean runAdmin = true;
        while (runAdmin) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 01 tp add a doctor , press 02 to add a doctor availability ,press 03 to view a selected exit. ");

            int userobj = sc.nextInt();
            if (userobj == 1) {
                //get the relevant data to add a doctor
                Controller.addDoctor();
                System.out.println("Doctor is successfully added.");
            } else if (userobj == 2) {
                //add doctors available time
                Controller.addAvailabilityForDoctor();
            } else if (userobj == 3) {
                runAdmin = false;
                System.out.println("Exit");
            }else {
                System.out.println("Invaild Input.");
            }
        }
    }

    public static void patientMenu() {
        boolean runPatient = true;

        while (runPatient) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Press 01 to view doctors , press 02 to book an appointment ,pree 03 to view a selected doctor's bookings , press 4 to exit and press 5 to add a patient. ");
            int userobj = sc2.nextInt();
            if(userobj == 1){
                Controller.viewAllDoctors();
            }else if (userobj == 2) {
                Controller.bookAppointment();
            } else if (userobj == 3) {
                System.out.println("view a selected doctor's bookings: ");
            } else if (userobj == 4) {
                runPatient = false;
                System.out.println("Exit");
            } else if(userobj == 5){
                Controller.addPatient();
            }else{
                System.out.println("Invaild Input.");
            }
        }
    }

    public static void run() {

        boolean runMain = true;

        while (runMain) {

            Scanner sc = new Scanner(System.in);
            System.out.println("If you are hospital administator please press 1 , if you are patient please press 2 and Press 3 to exit.");
            int userInput = sc.nextInt();

            if (userInput == 1) {
                adminMenu();
            } else if (userInput == 2) {
                patientMenu();
            } else if (userInput == 3) {
                runMain = false;
                System.out.println("Exit");
            } else {
                System.out.println("Invaild input.");
            }
        }
    }
    public static void main(String[] args) {

        Doctor sampleDoc = new Doctor(223,"ramesh da silva" , "22.2.1989","cardiophysician" ,"041 -345-4565");
        Patient samplePatient = new Patient("john anthon" , "T-12" ,"555-123-4545");
        Controller.alldoctors.add(sampleDoc);
        Controller.allPatients.add(samplePatient);
        System.out.println(samplePatient.getName());

        run();
    }



//    Doctor doctor1 = new Doctor( 001 ,"Ranasingha perera", "1988 /12/03 " , "Neurophysician" , "0778676009");
//    Doctor doctor2 = new Doctor(002 ,"kumudu prasad" , "1996 /1/12" , "Neurologist" , "0786787990");
//
//    //test doctor methods
//        System.out.println("Doctor 1: ");
//        System.out.println("Is Physician: " + doctor1.isPhysician());
//
//        System.out.println("\nDoctor 2: ");
//        System.out.println("Is Physician: " + doctor2.isPhysician() );
//
//
//    Patient patient1 = new Patient("charitha prasad" ,"T-0034" ,"2013/12/06" , "0786787990");
//    Patient patient2 = new Patient("Nihal pranandu" , "D-5690" , "1999/08/23" , "0786789009");
//
//
//        //test patient methods
//        System.out.println("\nPatient 1: ");
//        System.out.println("Patient Type: " + patient1.getPatientType());
//
//        System.out.println("\nPatient 2: ");
//        System.out.println("Patient Type:" + patient2.getPatientType());

}
