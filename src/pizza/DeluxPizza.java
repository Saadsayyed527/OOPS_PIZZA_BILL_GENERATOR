package pizza;

public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopping();
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraTopping() {

    }

    @Override
    public void takeAway() {
        super.takeAway();
    }

    @Override
    public void getBill() {
        super.getBill();
    }
}
