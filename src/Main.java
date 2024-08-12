import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    int age =15;



    //no return and no parameters
    public void changeTheAge()
    {
        System.out.println("After Calling: ");
        age = 45;
    }

    public static void main(String[] args) {


        Television tele = new Television();
//        System.out.println(tele.age);
//        tele.changeTheAge();
//        System.out.println(tele.age);
//        System.out.println(tele.getNewChannelNumber());

//        Scanner sc = new Scanner();
//        System.out.println("Enter marks: ");
        int userinput =39;
//        int userinput = sc.next();
        String name = "dasuni";
        String address = "Imaduwa"
                ;        String studentGrade = tele.getGrade(userinput, name ,address );
        System.out.println(studentGrade);




    }
}


