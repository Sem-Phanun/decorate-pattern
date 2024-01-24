public class Main {
    public static void main(String[] args) {
        AbstractDrink drink = new Drink("My drinks");
        System.out.println(drink.getDescr());

        System.out.println("\n>Milk decorated");
        drink = new MilkMixing("Dutch milk", 2.5, drink);
        System.out.println(drink.getDescr());

        System.out.println("\n>Coffee decorated");
        drink = new CoffeeMixing("Ice Latte", 1.1, drink);
        System.out.println(drink.getDescr());

        System.out.println("\n>Then SugarMixing");
        drink = new SugarMixing("Brown Sugar", 1.5, drink);
        System.out.println(drink.getDescr());

        System.out.println("\n>Then WaterMixing");
        drink = new WaterMixing("Lyon", 1.5, drink);
        System.out.println(drink.getDescr());

    }
}