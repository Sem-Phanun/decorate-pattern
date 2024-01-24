public abstract class DrinkMixing extends AbstractDrink {
    protected AbstractDrink drink;
    protected String name = "";
    protected double weight = 0.0;

    public DrinkMixing(AbstractDrink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescr(double weight) {
        if(drink == null){
            return "";
        }
        return drink.getDescr(weight);
    }

    @Override
    public double totalWeight() {
        if (drink == null) {
            return weight;
        }
        return drink.totalWeight() + weight;
    }
}
