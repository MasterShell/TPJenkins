package test.movie;

import TPRefactoring.movie.NewReleaseMovie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class NewReleaseMovieTest {
    int daysRented;

    @Before
    public void setUp() {
        daysRented = 4;
    }

    @Test
    public void getPrice() {
        //test if the price is well set ( 3 times the daysRented )
        NewReleaseMovie movie = new NewReleaseMovie("test");
        assertEquals(12, movie.getPrice(daysRented), 0);
    }

    @Test
    public void getFrequentRenterPoints() {
        NewReleaseMovie movie = new NewReleaseMovie("test");
        assertEquals(2, movie.getFrequentRenterPoints());
    }
}
