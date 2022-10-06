package Sprint1.Upg1.Upg1;

public class HotellGreenest implements Calculation { // Interface PrintOut metod i Calculation

    // Klassvariabler/inkapsling pga private
    private double lenght;
    private double liquid;
    private String name;


    // Konstruktorn
    HotellGreenest(double lenght, double liquid, String name){
        this.lenght = lenght;
        this.liquid = liquid;
        this.name = name;
    }

    protected PlantDrink dryckKranvatten = PlantDrink.KRANVATTEN;
    protected PlantDrink dryckMineralvatten = PlantDrink.MINERALVATTEN;
    protected PlantDrink dryckProteindryck = PlantDrink.PROTEINDRYCK;



    // Setters - Används för att kunna ändra en specifik parameter i konstruktorn

    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public void setLiquid(double liquid){
        this.liquid = liquid;
    }
    public void setName(String name){
        this.name = name;
    }

    // Getters - Används för att "plocka ut" en parameter i konstruktorn och bara redovisa den.

    public double getLenght(){
        return this.lenght;
    }
    public double getLiquid(){
        return this.liquid;
    }
    public String getName(){
        return this.name;
    }

    public void printOut(){

    }
}
