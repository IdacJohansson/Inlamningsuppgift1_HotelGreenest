package Sprint1.Upg1.Upg1;

import javax.swing.*;

public class Carnivorous extends HotellGreenest {

    Carnivorous(double lenght, double liquid, String name) {
        super(lenght, liquid, name);
    }

    public void printOut(){
        double operation = getLenght() * getLiquid();
        double roundUp = (double) Math.round(operation * 100) / 100;
        String printer = (roundUp + " L " + dryckProteindryck);
        JOptionPane.showMessageDialog(null, printer);
    }
}
