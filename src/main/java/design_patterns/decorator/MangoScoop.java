package design_patterns.decorator;

public class MangoScoop extends IngredientDecorator{

    public MangoScoop(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 55;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + " with Mango Scoop";
    }
}
