package test.movie;

import TPRefactoring.movie.ChildrenMovie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class ChildrenMovieTest {

    int daysRented;

    @Before
    public void setUp() {
        daysRented = 10;
    }

    @Test
    public void getPrice() {
        //test if the price is well set ( 1.5 more 1.5 times the daysRented minus 3 )
        ChildrenMovie movie = new ChildrenMovie("test");
        assertEquals(12, movie.getPrice(daysRented), 0);
    }

    @Test
    public void getFrequentRenterPoints() {
        //calling from super.method()
        ChildrenMovie movie = new ChildrenMovie("test");
        assertEquals(1, movie.getFrequentRenterPoints());
    }
}
