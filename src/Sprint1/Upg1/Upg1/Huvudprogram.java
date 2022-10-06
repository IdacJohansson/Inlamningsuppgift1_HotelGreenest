package Sprint1.Upg1.Upg1;

import javax.swing.*;


public class Huvudprogram {

    public static void main (String [] args) {

        // Ex Polymorfism?
        HotellGreenest Laura = new Palm(5, 0.5, "Laura");
        HotellGreenest Putte = new Palm(1, 0.5, "Putte");
        HotellGreenest Igge = new Cactus(0.20, 0.02, "Igge");
        HotellGreenest MeatLoaf = new Carnivorous(0.70, 0.2, "MeatLoaf");


        String name = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        switch (name){
            case "Laura":
                Laura.printOut();
                break;
            case "Putte":
                Putte.printOut();
                break;
            case "Igge":
                Igge.printOut();
                break;
            case "Meatloaf":
                MeatLoaf.printOut();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Denna växt har inte checkat in");
                break;


        }
    }
}
