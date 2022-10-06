package Sprint1.Upg1.Upg1;

import javax.swing.*;

public class Cactus extends HotellGreenest {

    Cactus(double lenght, double liquid, String name) {
        super(lenght, liquid, name);
    }

    public void printOut(){
        double operation = getLiquid();
        double roundUp = (double) Math.round(operation * 100) / 100;
        String printer = (roundUp + " CL " + dryckMineralvatten);
        JOptionPane.showMessageDialog(null, printer);

    }
}
