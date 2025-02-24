/** Jessica Long-Heinicke 2.23.25
 * Represents an international division of the company.
 * Extends the abstract Division class.
 */
class InternationalDivision extends Division {
    private String country;  // Country where the division is located
    private String language; // Primary language spoken in the division

    /**
     * Constructor to initialize an international division.
     * @param divisionName The name of the division
     * @param accountNumber The account number of the division
     * @param country The country where the division is located
     * @param language The primary language spoken in the division
     */
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    /**
     * Displays details about the international division.
     */
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
