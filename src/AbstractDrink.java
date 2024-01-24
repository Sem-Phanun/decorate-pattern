public abstract class AbstractDrink {
    public abstract double totalWeight();
    public abstract String getDescr(double weight);

    public String getDescr() {
        return getDescr(totalWeight());
    }

}
