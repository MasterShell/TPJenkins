package TPRefactoring.statement;

public class ActualStatement extends Statement {

    public String header(String name) {
        return "Rental Record for " + name + "\n";
    }

    public String totalAmountStatement(double totalAmount) {
        return "Amount owed is "
                + totalAmount
                + "\n";
    }

    public String frequentRenterPointsStatement(int frequentRenterPoints) {
        return "You earned "
                + frequentRenterPoints
                + "frequent renter points ";
    }
}