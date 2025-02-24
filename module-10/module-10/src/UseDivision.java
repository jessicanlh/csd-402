/** Jessica Long-Heinicke 2.23.25
 * Application to demonstrate the use of Division, InternationalDivision, and DomesticDivision classes.
 */
public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision
        InternationalDivision intlDiv1 = new InternationalDivision("Europe Division", 101, "Germany", "German");
        InternationalDivision intlDiv2 = new InternationalDivision("Asia Division", 102, "Japan", "Japanese");

        // Creating instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Division", 201, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Division", 202, "California");

        // Displaying details
        intlDiv1.display();
        intlDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
