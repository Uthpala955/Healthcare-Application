public class Patient extends Person {

    private String patientID;

    //constructors
    public Patient(String name, String patientID, String contactNumber) {
        super(name, contactNumber);
        this.patientID = patientID;
    }

    public String getPatientID() {
        return this.patientID;
    }

    @Override
    public void greeting() {
        System.out.println("Hello" + this.getName());
    }

    //get the first character of the patient ID
    public char getPatientType() {
        char firstLetter = this.patientID.charAt(0);
        return firstLetter;
    }
}