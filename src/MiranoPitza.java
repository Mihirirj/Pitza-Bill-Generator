public class MiranoPitza extends Pitza {
    public MiranoPitza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}

