package test;

import TPRefactoring.Rental;
import TPRefactoring.movie.Movie;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

@RunWith(JUnit4.class)
public class RentalTest {

    Movie movie;
    int daysRented = 2;
    double price = 1;

    @Before
    public void setUp() {
        movie = new Movie("test") {
            @Override
            public double getPrice(int daysRented) {
                return price*daysRented;
            }
        };
    }

    @org.junit.Test
    public void amoutFor() {
        Rental rental = new Rental(movie, daysRented);
        assertEquals(price*daysRented , rental.amoutFor(), 0);
    }

    @org.junit.Test
    public void statement() {
        Rental rental = new Rental(movie, 2);
        assertEquals("\t" + movie.getTitle() + "\t" + price*daysRented + "\n" , rental.statement());
    }
}
