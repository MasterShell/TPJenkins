package test;

import TPRefactoring.Customer;
import TPRefactoring.Rental;
import TPRefactoring.movie.Movie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Vector;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CustomerTest {
    Vector<Rental> rentals_;
    Rental rental;

    @Before
    public void setUp() {
        rentals_ = new Vector<>();
        rental = new Rental(new Movie("test") {
            @Override
            public double getPrice(int daysRented) {
                return 1;
            }
        }, 1);
    }

    @Test
    public void addRentals() {
        Customer customer = new Customer("test");
        customer.addRentals(rental);
        if (customer.getRentals().size() == 0) {
            fail("rentals is empty");
        } else {
            assertEquals(rental, customer.getRentals().get(0));
        }
    }
}
