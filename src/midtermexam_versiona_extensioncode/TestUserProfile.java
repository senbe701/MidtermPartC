/*
    Name: Berat U. Sen
    Midterm Part C
    Date: 08/03/2019
*/
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Berat
 */
public class TestUserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        UserProfile user = new UserProfile();
        
        System.out.println("Enter your name");
        String userName = input.nextLine();
        user.setUserID(userName);
        
        System.out.println("Choose your favourite genre");
        System.out.println("Available genres:");
        user.printGenres();
        
        String genre = input.nextLine();
        user.setGenre(genre);
        System.out.println("User profile created successfully!");
        System.out.println("User name: " + user.getUserID() + 
            "\nFavourite genre: " + user.getGenre());
    }

}
