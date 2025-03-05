import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String [] args){
        //Character reference
        Character character = new Character();
        character.IncInt();

        //JFrame start
        JFrame frame = new JFrame("Solo");
        frame.setSize(500,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //Panel with button
        JPanel panel = new JPanel();
        JButton button = new JButton("Add Stat");

        //Button action
        button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Button clicked");
                }
        });

        //Another panel with text
        JPanel textPanel = new JPanel();
        JLabel label2 = new JLabel("StatsStatsStats");
        textPanel.add(label2);


        //Label
        JLabel label = new JLabel(String.valueOf(character));


        //Set layout
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(textPanel,BorderLayout.SOUTH);
        panel.add(button,BorderLayout.EAST);


        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
        //JFrame end








    }
}
