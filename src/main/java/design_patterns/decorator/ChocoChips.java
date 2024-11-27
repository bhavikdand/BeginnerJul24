package design_patterns.decorator;

public class ChocoChips extends IngredientDecorator{

    public ChocoChips(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + " with Choco Chips";
    }
}
