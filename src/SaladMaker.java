public class SaladMaker {
    public static void main(String[] args) {
        Salad mySalad = new Olives(new Paprika(new Cucumbers(new BasicSalad())));
        System.out.println("Ingridients: " + mySalad.getDescription());
        System.out.println("The price for this salad is: " + mySalad.getCost() + " dollars");
    }
}
