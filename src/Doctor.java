import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Doctor extends Person {

    private int doctorId;
    private String birthday;
    private String specialization;
    private ArrayList<Date> availabilities;
    private HashMap<Date,ArrayList<Appointment>> allAppointments = new HashMap<>();

    //constructor
    public Doctor( int doctorId ,String name , String birthday ,String specialization ,String contactNumber)
    {
        super(name,contactNumber);
        this.doctorId=doctorId;
        this.birthday = birthday ;
        this.specialization = specialization;
        availabilities = new ArrayList<>(); // each doctors have unique empty arraylist

    }

    public Doctor( int doctorId ,String name , String birthday ,String contactNumber)
    {
        super(name,contactNumber);
        this.doctorId=doctorId;
        this.birthday = birthday ;
        this.specialization = "General Doctor";
        availabilities = new ArrayList<>(); // each doctors have unique empty arraylist

    }

    public void greeting() {
        System.out.println("Hello Doctor!" + this.getName());
    }

    //method
    public boolean isPhysician(){

        boolean endingWithPhysician =this.specialization.endsWith("physician");
        return endingWithPhysician;

    }

    public void setAvailabilities(Date availableDates) {
        this.availabilities.add(availableDates);
    }


    public  void setAnAppointment(Appointment appointment,Date date){
        ArrayList<Appointment>currentAppointment = this.allAppointments.get(date);
        if(currentAppointment == null ){
            ArrayList<Appointment> tempArrayList = new ArrayList<>();
            tempArrayList.add(appointment);
            this.allAppointments.put(date,tempArrayList);
        }else{
            currentAppointment.add(appointment);
            this.allAppointments.put(date,currentAppointment);
        }

        //this.allAppointments.put(date,);
    }
    public ArrayList<Date> getAvailabilities()
    {return availabilities;
    }

    public HashMap<Date ,ArrayList<Appointment>> getAllAppointments(){
        return allAppointments;
    }

    public int getDoctorId(){
        return doctorId;
    }

    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

}
