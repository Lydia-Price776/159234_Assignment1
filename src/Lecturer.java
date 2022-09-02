/*
This class stores the information about each lecturer
 */

public class Lecturer {
    private int ID; // Stores ID number of the lecturer
    private String firstName; //Stores first name of the lecturer
    private String lastName; // Stores last name of the lecturer
    private String fullName; // Store the full name of the lecturer
    private String Campus; // Stores the campus the lecturer is based at
    private int assign = 0; //Keeps track of the number of papers the lecturer is assigned

    public Lecturer (int ID, String firstName, String lastName, String Campus) {
        setID(ID);
        setFirstName(firstName);
        setLastName(lastName);
        setCampus(Campus);
        fullName = firstName + " " + lastName;
    }

    public int getID () {
        return ID;
    }

    public void setID (int ID) {
        this.ID = ID;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }


    public String getCampus () {
        return Campus;
    }

    public void setCampus (String Campus) {
        this.Campus = Campus;
    }

    public int getAssign () {
        return assign;
    }



    public String getFullName () {
        return fullName;
    }

    //Increases how many papers a lecturer is teaching
    public void addAssign () {
        assign++;
    }
}
