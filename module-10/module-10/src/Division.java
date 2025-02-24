/** Jessica Long-Heinicke 2.23.25
 * Abstract class representing a company division.
 * Contains fields for division name and account number.
 */
abstract class Division {
    protected String divisionName; // Name of the division
    protected int accountNumber;   // Unique account number for the division

    /**
     * Constructor to initialize division name and account number.
     * @param divisionName The name of the division
     * @param accountNumber The account number of the division
     */
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /**
     * Abstract method to display division details.
     * This must be implemented by subclasses.
     */
    public abstract void display();
}
