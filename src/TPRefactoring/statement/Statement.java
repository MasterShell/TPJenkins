package TPRefactoring.statement;

import TPRefactoring.Customer;
import TPRefactoring.Rental;

public abstract class Statement {

    public abstract String header(String name);

    public abstract String totalAmountStatement(double totalAmount);

    public abstract String frequentRenterPointsStatement(int frequentRenterPoints);

    public String statement(Customer customer) {
        double totalAmount = 0;

        int frequentRenterPoints = 0;

        StringBuilder result = new StringBuilder();

        result.append(header(customer.getName()));

        for(Rental each: customer.getRentals()){

            frequentRenterPoints += each.getMovie().getFrequentRenterPoints();

            // show figures for this rental
            result.append(each.statement());

            totalAmount += each.amoutFor();
        }
        // add footer lines
        result.append(totalAmountStatement(totalAmount));
        result.append(frequentRenterPointsStatement(frequentRenterPoints));

        return result.toString();
    }
}