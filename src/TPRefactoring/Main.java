/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */

/**

 * @author m34lmar

 */
package TPRefactoring;

import TPRefactoring.movie.ChildrenMovie;
import TPRefactoring.movie.Movie;
import TPRefactoring.movie.NewReleaseMovie;
import TPRefactoring.movie.RegularMovie;
import TPRefactoring.statement.ActualStatement;
import TPRefactoring.statement.Statement;

public class Main {

    public static void main(String[] a){
        Movie m1 = new RegularMovie("M1");
        Movie m2 = new NewReleaseMovie("M2");
        Movie m3 = new NewReleaseMovie("M3");
        Movie m4 = new ChildrenMovie("M4");
        Movie m5 = new ChildrenMovie("M5");

        Customer c1 = new Customer("Moi");

        c1.addRentals(new Rental(m5, 5));
        c1.addRentals(new Rental(m1, 10));
        c1.addRentals(new Rental(m3, 5));

        Statement s = new ActualStatement();
        System.out.println(s.statement(c1));
    }
}