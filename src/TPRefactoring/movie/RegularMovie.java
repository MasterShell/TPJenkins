package TPRefactoring.movie;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented){
        int price = 2;

        if (daysRented > 2) {
            price += (daysRented - 2) * 1.5;
        }

        return price;
    }
}
