package design_patterns.decorator;

public class Client {

    public static void main(String[] args) {
        Ingredient icecream = new ChocoChips(
            new MangoScoop(
                new ChocoCone()
            )
        );


        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}
