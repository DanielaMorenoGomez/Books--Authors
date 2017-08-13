
/**
 * This class displays the Author's name, email, and gender for a library's database.
 * 
 * @author Ben Christofferson and Daniela Moreno  
 * @version 2/3/2017
 */
public class Author
{
    private String name;
    private String email;
    private char gender;

    /**
     * @param authorName the book's author's name
     */
    public Author(String authorName) {
        this.name = authorName;
    }

    /**
     * @param authorName the book's author's name
     * @param authorEmail the book's author's email
     * @param authorGender the book's author's gender
     */public Author(String authorName, String authorEmail, char authorGender) {
        this.name = authorName;
        this.email = authorEmail;
        this.gender = authorGender;
    }

    /**
     * @return current author's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return current author's email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return current author's gender
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * @param newName defines the new book's author name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * @param defines the new book's author's email
     */
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * @param defines the new book's author's gender
     */
    public void setGender(char newGender) {
        this.gender = newGender;
    }

    /**
     * @return true if the author has an email address
     * @return falsi if the author does not have an email address
     */
    public boolean hasEmail() {
        if(email == ""){
            return false;
        } 
        else {
            return true;
        }
    }

    /**
     * @return false if we do not know the author's gender
     * @return true if we know the author's gender
     */
    public boolean hasGender() {
        if(gender == '\u0000') {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * @return the description of the book's author's information
     */
    public String toString() {
        String description = "The author's gender is " + this.gender + " and his/her email is " + this.email;
        return description;
    }
}

