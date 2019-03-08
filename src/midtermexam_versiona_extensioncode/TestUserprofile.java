
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TestUserprofile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your ID ");
        String name = in.nextLine();
        System.out.println("Please Favorite Genre ");
        String genre = in.nextLine();        
        
        UserProfile u1 = new UserProfile(name, genre);
        
        
    }
}
