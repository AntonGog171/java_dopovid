public class BasicSalad implements Salad{

    @Override
    public String getDescription() {
        return "Lettuce";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
