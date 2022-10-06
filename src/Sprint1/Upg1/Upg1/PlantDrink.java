package Sprint1.Upg1.Upg1;

public enum PlantDrink { // Enum för plantornas vätska

    KRANVATTEN("Palmer"),
    MINERALVATTEN("Igge"),
    PROTEINDRYCK("Meatloaf");

    public final String namn;

    PlantDrink( String n) {
        namn = n;

    }
}
