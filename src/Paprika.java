public class Paprika extends SaladToppingDecorator{

    public Paprika(Salad newSalad) {
        super(newSalad);
        System.out.println("added paprika");
    }

    public String getDescription(){
        return tempSalad.getDescription() + " Paprika";
    }

    public double getCost(){
        return tempSalad.getCost() + 2;
    }
}
