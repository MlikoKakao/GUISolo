import javax.swing.*;
import java.awt.*;

public class SoloGUI extends JFrame {
    public SoloGUI(){
        super("Solo Leveling");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,800);

        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        addGuiComponents();

    }
    private void addGuiComponents(){
        JTextField searchTF = new JTextField();
        searchTF.setBounds(15,15,351,45);

        //Search text field added
        searchTF.setFont(new Font("Dialog", Font.PLAIN,24));
        add(searchTF);

        //Search button
        JButton searchBT = new JButton("Search");
        searchBT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchBT.setBounds(375,13,100,45);
        add(searchBT);

        //INT label
        JLabel intLbl = new JLabel("INT");
        intLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        intLbl.setBounds(50,100,80,40);
        add(intLbl);
        intLbl.setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
