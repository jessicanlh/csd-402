/** Jessica Long-Heinicke 2.23.25
 * Represents a domestic division of the company.
 * Extends the abstract Division class.
 */
class DomesticDivision extends Division {
    private String state; // The state where the division is located

    /**
     * Constructor to initialize a domestic division.
     * @param divisionName The name of the division
     * @param accountNumber The account number of the division
     * @param state The state where the division is located
     */
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    /**
     * Displays details about the domestic division.
     */
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
