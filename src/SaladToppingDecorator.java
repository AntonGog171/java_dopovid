abstract class SaladToppingDecorator implements Salad{
    protected Salad tempSalad;
    public SaladToppingDecorator(Salad newSalad){
        tempSalad = newSalad;
    }

    public String getDescription(){
        return tempSalad.getDescription();
    }

    public double getCost(){
        return tempSalad.getCost();
    }
}
