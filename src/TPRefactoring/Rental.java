/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

/**

 *

 * @author m34lmarW

 */

package TPRefactoring;

import TPRefactoring.movie.Movie;

public class Rental {

    private int _daysRented;

    private Movie _movie;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double amoutFor() {
        return this.getMovie().getPrice(this.getDaysRented());
    }
    
    public String statement(){
        return "\t" + this.getMovie().getTitle() + "\t" + this.amoutFor() + "\n";
    }
}