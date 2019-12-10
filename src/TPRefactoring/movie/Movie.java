package TPRefactoring.movie;

import java.lang.*;

//  Movie is just a simple data class
public abstract class Movie {

    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() { 
        return _title;
    }

    public abstract double getPrice(int daysRented);

    public int getFrequentRenterPoints(){
        return 1;
    }
}

