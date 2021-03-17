package pentazon.customers;

import java.util.List;

/**
 * Class to depict users of the pentazon system
 * @@author Jay!
 */
public abstract class Customer {
    private Integer id;
    private String firstName;
    private String surname;

    private List<Address> addresses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
