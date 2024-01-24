public class Drink extends AbstractDrink {

    protected String name = "Unknown Drink";

    public Drink(String name) {
        if (name != null) {
            name = name.trim();
            if (!name.isEmpty()) {
                this.name = name;
            }
        }
    }
    @Override
    public double totalWeight() {
        return 0.0;
    }

    @Override
    public String getDescr(double weight) {
        return String.format("%s: %.2f g", name, weight);
    }
}
