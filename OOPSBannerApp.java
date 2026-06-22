/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 *
 * @author Developer
 * @version 5.0
 */

// Extend the user story 4 to further develop the OOPS Banner Application by
// not only using String arrays to hold banner lines and printing them in a
// loop. But also by defining and populating the array in a more concise way
// at the time of declaration using String.join() method to create each line
// of the banner.

public class OOPSBannerApp {
    public static void main(String[] args)

        String[] lines = {
                String.join( " " , "   ***   " , "   ***   " , "******   " , "   ***** "),
                String.join( " " , " **   ** " , " **   ** " , "**    ** " , " **      "),
                String.join( " " , "**     **" , "**     **" , "**     **" , "**       "),
                String.join( " " , "**     **" , "**     **" , "**    ** " , "  *****  "),
                String.join( " " , "**     **" , "**     **" , "******   " , "      ** "),
                String.join( " " , " **   ** " , " **   ** " , "**       " , " **   ** "),
                String.join( " " , "   ***   " , "   ***   " , "**       " , "  *****  ")
        }
        for(String line : lines){
            System.out.println(line);
        }
    }
}
