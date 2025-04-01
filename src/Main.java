import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String [] args){

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SoloGUI().setVisible(true);
            }
        });



    }
}
