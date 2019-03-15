package ac.za.cputAssignmentA;

public class Students implements ClassRoom {

    public Students(String firstName, String lastName, int age, double tuesion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.tuesion = tuesion;
    }

    private String firstName;
    private String lastName;
    private int age;
    private double tuesion;




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public Students() {
    }


}
