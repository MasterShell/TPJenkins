package test.movie;

import TPRefactoring.movie.RegularMovie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class RegularMovieTest {

    int daysRented;

    @Before
    public void setUp() {
        daysRented = 12;
    }

    @Test
    public void getPrice() {
        //test if the price is well set ( 2 more 1.5 times the daysRented less 2)
        RegularMovie movie = new RegularMovie("test");
        assertEquals(17, movie.getPrice(daysRented), 0);
    }

    @Test
    public void getFrequentRenterPoints() {
        //calling from super.method()
        RegularMovie movie = new RegularMovie("test");
        assertEquals(1, movie.getFrequentRenterPoints());
    }
}
