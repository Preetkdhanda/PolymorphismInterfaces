package attractions;
import people.Visitor;

public class Dodgems extends Attraction {

    private double price;
    private Visitor visitor;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double halfPriceForChildren(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price * 0.5;
        } else {
            return this.price ;
        }

    }
}
