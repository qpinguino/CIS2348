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
    public void setAddress(String str, int num){
        address[num] = str;
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

        System.out.println("-Getting Student Info-");

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
            System.out.println("Please enter an email:");
            String s = kb.nextLine();
            if(s.matches("[a-zA-Z0-9]+[@][a-zA-Z0-9]+[.]((?:com)|(?:org)|(?:edu))")){
                setEmail(s);
                System.out.println("Email accepted.");
                break;
            }
            System.out.println("Incorrect email format. Please try again");
        }while(true);

        //Address
        //Line 1
        do {
            System.out.println("Please enter the address line 1:");
            String s = kb.nextLine();
            if(s.matches("[0-9]+\\s[ a-zA-Z]+")) {
                System.out.println("Address line 1 accepted");
                setAddress(s,0);
                break;
            }

            System.out.println("Address line must contain a number followed by a space and a street name. Please try again");
        }while(true);
        //City
        do {
            System.out.println("Please enter the city name:");
            String s = kb.nextLine();
            if(s.matches("[ a-zA-Z]+")) {
                System.out.println("City name accepted");
                setAddress(s,1);
                break;
            }

            System.out.println("City name can only contain letters. Please try again");
        }while(true);
        //State
        do {
            System.out.println("Please enter the state:");
            String s = kb.nextLine();
            if(s.equals("AK" ) || s.equals("AL") || s.equals( "AR") || s.equals( "AZ") || s.equals( "CA") || s.equals( "CO") || s.equals( "CT") || s.equals( "DC") || s.equals( "DE") || s.equals( "FL") || s.equals( "GA") || s.equals( "HI") || s.equals( "IA") || s.equals( "ID") || s.equals( "IL") || s.equals( "IN") || s.equals( "KS") || s.equals( "KY") || s.equals( "LA") || s.equals( "MA") || s.equals( "MD") || s.equals( "ME") || s.equals( "MI") || s.equals( "MN") || s.equals( "MO") || s.equals( "MS") || s.equals( "MT") || s.equals( "NC") || s.equals( "ND") || s.equals( "NE") || s.equals( "NH") || s.equals( "NJ") || s.equals( "NM") || s.equals( "NV") || s.equals( "NY") || s.equals( "OH") || s.equals( "OK") || s.equals( "OR") || s.equals( "PA") || s.equals( "RI") || s.equals( "SC") || s.equals( "SD") || s.equals( "TN") || s.equals( "TX") || s.equals( "UT") || s.equals( "VA") || s.equals( "VT") || s.equals( "WA") || s.equals( "WI") || s.equals("WV") || s.equals("WY")){
                System.out.println("State accepted");
                setAddress(s,2);
                break;
            }
            System.out.println("State should be 2 capital letters. Please try again");
        }while(true);
        //zipcode
        do {
            System.out.println("Please enter the zip code:");
            String s = kb.nextLine();
            if(s.matches("[0-9]{9}")) {
                System.out.println("Zip code accepted");
                setAddress(s,3);
                break;
            }
            System.out.println("Zip code should be 9 numbers. Please try again");
        }while(true);

        return;
    }

    //Display Info--------------------------------------------------------------------------

    public void displayInfo()
    {
        System.out.print(firstName);
        System.out.print("\t"+lastName);
        System.out.print("\t"+peopleSoftID);
        System.out.print("\t"+classStanding);
        System.out.print("\t"+email);
        System.out.print("\t"+address[0]);
        System.out.print("\t"+address[1]);
        System.out.print("\t"+address[2]);
        System.out.print("\t"+address[3]+"\n");
    }
}
