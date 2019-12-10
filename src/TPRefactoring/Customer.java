/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

/**

 *

 * @author m34lmar

 */

package TPRefactoring;

import java.util.*;

public class Customer {

    private String name_;

    private Vector<Rental> rentals_;

    public Customer(String name) {
        name_ = name;
        rentals_ = new Vector<>();
    }

    public void addRentals(Rental arg) {
        rentals_.addElement(arg);
    }

    public Vector<Rental> getRentals() {
        return rentals_;
    }

    public String getName() {
        return name_;
    }
}