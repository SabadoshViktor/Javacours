public class Person2 {

    String firstName;
    String lastName;
    Gadget gadget;

    public Person2(String firstName, String lastName, Gadget gadget) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gadget = gadget;
    }

    public Gadget getGadget() {
        return gadget;
    }

    public String getFullName() {
        return firstName + lastName;
    }
}