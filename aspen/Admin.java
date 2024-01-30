package aspen;
import java.util.Date;

//admin inherits everything from Person

public class Admin extends Person{
    // firstname ,lastname, DOB, office number, hair color

    private int officeNumber;

    public Admin(String firstName, String lastName, Date DOB, String hairColor, int officeNumber) {
        
        super(firstName, lastName, DOB, hairColor);

        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
    

}


