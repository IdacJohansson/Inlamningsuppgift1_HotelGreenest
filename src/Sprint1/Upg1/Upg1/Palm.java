package Sprint1.Upg1.Upg1;

import javax.swing.*;

public class Palm extends HotellGreenest { // Arv

        Palm(int lenght, double liquid, String name) {
            super(lenght, liquid, name);
        }

        // Polymorfism

        @Override
        public void printOut(){
            double operation = getLenght() * getLiquid();
            double roundUp = (double) Math.round(operation * 100) / 100; // RoundUp in case att man ändrar mängden
            String printerLaura = (roundUp + " L " + dryckKranvatten);
            JOptionPane.showMessageDialog(null, printerLaura);
        }
}
