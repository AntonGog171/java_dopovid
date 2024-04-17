public class Cucumbers extends SaladToppingDecorator{

    public Cucumbers(Salad newSalad) {
        super(newSalad);
        System.out.println("added cucumbers");
    }

    public String getDescription(){
        return tempSalad.getDescription() + " Cucumbers";
    }

    public double getCost(){
        return tempSalad.getCost() + 3;
    }
}
