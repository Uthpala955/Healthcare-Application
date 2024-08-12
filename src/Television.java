public class Television {

    int age = 15;
    int channelnumber =0 ;

    //no return and no parameters
    public void changeTheAge()
    {
        System.out.println("After Calling: ");
        age = 45;
    }


    //has a return and no parameters
    public int getNewChannelNumber()
    {
        int newChannelNumber = channelnumber +1 ;
        System.out.println("New Channel Number: ");
        return newChannelNumber;

    }

    //no return and has parameter
    public  String getGrade(int marks ,String name ,String address )
    {
        String grade;
        if(marks >35)
        {
            grade ="pass";
        }else{
            grade ="fail";
        }
        return grade;
    }

}
