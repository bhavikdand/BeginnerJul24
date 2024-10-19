package adv_lc_1.generics.bounded_generics;

public class Main {
    public static void main(String[] args) {
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat());
        catPrinter.giveFood();
        //AnimalPrinter<String> stringPrinter = new AnimalPrinter<>("Strinfngdfg");
        AnimalPrinter<Animal> animalPrinter = new AnimalPrinter<>(new Animal());
    }
}
