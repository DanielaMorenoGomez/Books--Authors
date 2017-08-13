
/**
 * This class tests the Author class.
 * 
 * author Ben Christofferson and Daniela Moreno
 * @version 2/3/2017
 */
public class AuthorTest {
    public static void main(String args[])
    {
        //Create an Author object using the constructor with just a name
        Author me = new Author("Jen Rosato");

        //Create an Author object using the constructor with a name, email, and gender
        Author you = new Author("CIS Student");

        //Print the authors
        System.out.println(me);
        System.out.println(you);

        //Change the author names
        me.setName("Jennifer Rosato");
        System.out.println("Changing the name: " + me);

        //Adding an email and gender
        me.setEmail("jrosato@css.edu");
        me.setGender('F');
        System.out.println("With email and gender: " + me);
    }
}

