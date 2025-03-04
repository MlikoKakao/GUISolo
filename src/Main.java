import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String [] args){
        Character character = new Character();
        character.IncInt();
        JFrame frame = new JFrame("Solo");
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        JLabel label = new JLabel(String.valueOf(character));
        frame.add(label);
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);









    }
}
