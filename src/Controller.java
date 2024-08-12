import java.util.*;

public class Controller {

    public static ArrayList<Doctor> alldoctors = new ArrayList<>();
    public static ArrayList<Patient> allPatients = new ArrayList<>();
    public static int NUMBER_OF_SLOTS = 5;
    public static void addDoctor(){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc1.nextLine();
        System.out.println("Enter your birthday: ");
        String birthday = sc1.nextLine();
        System.out.println("Enter your specialization: ");
        String specialization = sc1.nextLine();
        System.out.println("Enter your contact number: ");
        String contactNumber = sc1.nextLine();

        Random random = new Random();
        Doctor temporaryDoct = new Doctor(random.nextInt(), name, birthday, specialization, contactNumber);
        alldoctors.add(temporaryDoct);

    }

    public static void addAvailabilityForDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the doctor ID you want to add availability: ");
        int docId = sc.nextInt();
        Doctor  selcetedDoctor =null;

        //we need to fetch the doctor from the arraylist
        for(Doctor doc : alldoctors){
            if(doc.getDoctorId() == docId){
                selcetedDoctor = doc;
            }
        }

        //if the doctor is not existing, we need to print " No doctor found"
        if(selcetedDoctor == null){
            System.out.println("No doctor found.");
            return;
        }
        //if the doctor is not existing,take the date

        System.out.println("Enter the day you want to add Availability: ");
        int day = sc.nextInt();
        System.out.println("Enter the month you want to add Availability: ");
        int month = sc.nextInt();
        System.out.println("Enter the year you want to add Availability: ");
        int year = sc.nextInt();
        Date bookingDate = new Date(year,month,day);
        //add the availability for the doctors
        selcetedDoctor.setAvailabilities(bookingDate);
    }
    public static void viewAllDoctors(){

        for (Doctor doc : Controller.alldoctors) {
            System.out.println(doc.getName() + " has a specialization of " + doc.getSpecialization() +" has a id of " + doc.getDoctorId() + " and has a availability of " + doc.getAvailabilities().toString());
            System.out.println(doc.getDoctorId());
        }
    }

    public static void addPatient(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Patient name: ");
        String name = scanner.nextLine();
        System.out.println("Enter patient's Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter patient's contact Information: ");
        String contact = scanner.nextLine();

        Patient tempPatient = new Patient(id,name,contact);
        allPatients.add(tempPatient);

        System.out.println("Patient is Added");
        System.out.println(allPatients.toString());

    }

    public static void bookAppointment(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor's ID you want to make an appointment: ");
        int docId =scanner.nextInt();
        System.out.println("Enter you patient's id: ");
        String patientId = scanner.next();

        System.out.println("Enter the day you want to add Appointment: ");
        String day = scanner.next();
        System.out.println("Enter the month you want to add Appointment: ");
        String month = scanner.next();
        System.out.println("Enter the year you want to add Appointment: ");
        String year = scanner.next();

        //get patient and doctor
        Patient selectedPatient = getPatientById(patientId);
        Doctor selectedDoc = getDoctorById(docId);
        if ( selectedDoc == null || selectedPatient == null ){
            System.out.println("Invaild doc or patient id.");
            return;
        }
        Date appointmentDate = new Date(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));

        //check the availability and slots
        boolean isAvailable = checkAvailability(selectedDoc,appointmentDate);
        if (isAvailable){
            String appTime = getTimeForBooking(selectedDoc,appointmentDate);
            if(appTime != null ){
                Appointment appointment = new Appointment(selectedDoc , selectedPatient ,"No Notes", appointmentDate, "");
                selectedDoc.setAnAppointment(appointment,appointmentDate);
                System.out.println(selectedDoc.getAllAppointments().toString());
            }else{
                System.out.println("All the slots are filled.");
            }
            //calculate the appointment time and slot availability
            //make the appointment
        }else{
            System.out.println("Doctor is not available on the selected date.");
        }
    }

    private static String getTimeForBooking(Doctor selectedDoc , Date dateOfBooking){
        for (Map.Entry<Date,ArrayList<Appointment>> appointment : selectedDoc.getAllAppointments().entrySet()) {
            if(appointment.getKey().equals(dateOfBooking)){
                int numberOfSlots = appointment.getValue().size();
                if(numberOfSlots > NUMBER_OF_SLOTS -1){
                    return null;
                }
                System.out.println("We can make a booking.");
                int time = 17 + appointment.getValue().size();
                String strTime = time + " : 00";
                return strTime;
            }
        }
        return "17 : 00";
    }

    private static boolean checkAvailability(Doctor selectedDoc,Date dateOfBooking){
        for(Date day : selectedDoc.getAvailabilities()){
            if(day.equals(dateOfBooking)){
                return true;
            }
        }
        return false;
    }

    //make for each loops
    public static Patient getPatientById(String id){
        for(Patient patient : allPatients){
            if(patient.getPatientID().equals(id)){
                return patient;
            }
        }
        return null ;
    }
    public static Doctor getDoctorById(int id){
        for(Doctor doc : alldoctors){
            if(doc.getDoctorId() == id ){
                return doc;
            }
        }
        System.out.println("No doctor found.");
        return null ;
    }



}

