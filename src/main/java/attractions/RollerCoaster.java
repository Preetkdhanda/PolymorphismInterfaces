package attractions;


import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {
    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        } else return false;
    }

    public double doubleFeeForTallPeople(Visitor visitor){
        if(visitor.getHeight()>200){
            return this.price * 2;
        }else{
            return this.price;
        }

    }
}
