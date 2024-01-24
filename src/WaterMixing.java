public class WaterMixing extends DrinkMixing{
    public WaterMixing(String name, double weight, AbstractDrink drink){
        super(drink);
        this.name = name.trim();
        if (this.name.isEmpty()){
            this.name = "Un know Drink";
        }
        this.weight = weight;
    }
    @Override
    public String getDescr(double weight) {
        double per = 0.0;
        if (weight != 0) {
            per = this.weight / weight;
        }

        String temp = super.getDescr(weight).trim();

        if (!temp.isEmpty()) {
            temp += System.lineSeparator();
        }

        return String.format("%s+Coffee(%s, %.2f g, %.2f%%)", temp, name, this.weight, per * 100);
    }

    @Override
    public double totalWeight() {
        if (drink == null) {
            return weight;
        }
        return drink.totalWeight()+ weight;
    }

}
