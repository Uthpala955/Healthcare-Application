import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> doctors = new ArrayList<>();
        //adding doctors using array
        doctors.add("kumara");
        doctors.add("Ramesh");
        doctors.add("pathirana");

        System.out.println(doctors.get(0));
        System.out.println(doctors.size());

        //for loop
        for(int i = 0 ; i< doctors.size() ; i++){
            System.out.println(doctors.get(i));
        }

        //for each
        for(String doctor : doctors){
            System.out.println(doctor);
        }
    }
}