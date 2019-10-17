import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String peopleSoftID;
    private String classStanding;
    private String email;
    private String[] address = new String[4];

    private static int count = 0;

    //setters-------------------------------------------------------------------------

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setPeopleSoftID(String peopleSoftID){
        this.peopleSoftID = peopleSoftID;
    }
    public void setClassStanding(String classStanding){
        this.classStanding = classStanding;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String line1, String city, String state, String zipcode){
        address[0] = line1;
        address[1] = city;
        address[2] = state;
        address[3] = zipcode;
    }

    //getters-----------------------------------------------------------------------------
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPeopleSoftID(){
        return peopleSoftID;
    }
    public String getClassStanding(){
        return classStanding;
    }
    public String getEmail(){
        return email;
    }
    public String[] getAddress(){
        return address;
    }

    //methods-------------------------------------------------------------------------------
    public void getInfo(){
        Scanner kb = new Scanner(System.in);

        System.out.println("-Getting Student Info");

        //First Name
        do {
            System.out.println("Please enter the first name:");
            String s = kb.nextLine();
            if(s.matches("^[a-zA-Z]*$")){
                setFirstName(s);
                System.out.println("First Name accepted.");
                break;
            }
            System.out.println("First Name can only contain letters (A-Z). Please try again");
        }while(true);

        //Last Name
        do {
            System.out.println("Please enter the last name:");
            String s = kb.nextLine();
            if(s.matches("^[a-zA-Z]*$")){
                setLastName(s);
                System.out.println("Last Name accepted.");
                break;
            }
            System.out.println("Last Name can only contain letters (A-Z). Please try again");
        }while(true);

        //PeopleSoftID
        do {
            System.out.println("Please enter the PeopleSoft ID:");
            String s = kb.nextLine();
            if(s.matches("^[0-9]{1,7}")){
                setPeopleSoftID(s);
                System.out.println("PeopleSoft ID accepted.");
                break;
            }
            System.out.println("PeopleSoft ID can only contain from 1 to 7 numbers. Please try again");
        }while(true);

        //Class Standing
        do {
            System.out.println("Please enter the class Standing:");
            String s = kb.nextLine();
            if(s.equals("freshman") || s.equals("sophmore") || s.equals("junior") || s.equals("senior")){
                setClassStanding(s);
                System.out.println("Class Standing accepted.");
                break;
            }
            System.out.println("Class standing can only be freshman, sophomore, junior, or senior. Please try again");
        }while(true);

        //Email
        do {
            System.out.println("Please enter the PeopleSoft ID:");
            String s = kb.nextLine();
            if(s.matches("^[com|org|edu]")){
                setPeopleSoftID(s);
                System.out.println("PeopleSoft ID accepted.");
                break;
            }
        System.out.println("PeopleSoft ID can only contain from 1 to 7 numbers. Please try again");
        }while(true);


        return;
    }

}
