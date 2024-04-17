public class Olives extends SaladToppingDecorator{

    public Olives(Salad newSalad) {
        super(newSalad);
        System.out.println("added olives");
    }

    public String getDescription(){
        return tempSalad.getDescription() + " Olives";
    }

    public double getCost(){
        return tempSalad.getCost() + 4;
    }
}
