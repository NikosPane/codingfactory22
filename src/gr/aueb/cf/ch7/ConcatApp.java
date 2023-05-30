package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr. ";
        String firstname = "Nikos ";
        String lastname = "Panethymitakis";
        String fullName;
        String titledFullName;

        fullName = firstname + lastname;
        // chaining methods
        titledFullName = title.concat(firstname).concat(lastname);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
