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
        searchTF.setBounds(65,15,351,45);

        //Search text field added
        searchTF.setFont(new Font("Dialog", Font.PLAIN,24));
        add(searchTF);

        //Search button
        JButton searchBT = new JButton("Search");
        searchBT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchBT.setBounds(425,15,100,45);
        add(searchBT);

        //INT label
        JLabel intLbl = new JLabel("INT");
        intLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        intLbl.setBounds(50,100,80,40);
        intLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(intLbl);


        JLabel strLbl = new JLabel("STR");
        strLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        strLbl.setBounds(50,200,90,40);
        strLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(strLbl);

        JLabel senLbl = new JLabel("SEN");
        senLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        senLbl.setBounds(50,300,90,40);
        senLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(senLbl);

        JLabel apLbl = new JLabel("APP");
        apLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        apLbl.setBounds(50,400,90,40);
        apLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(apLbl);

        JLabel durLbl = new JLabel("DUR");
        durLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        durLbl.setBounds(50,500,90,40);
        durLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(durLbl);

        JLabel intStatLbl = new JLabel("0");
        intStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        intStatLbl.setBounds(450,100,70,40);
        intStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(intStatLbl);

        JLabel strStatLbl = new JLabel("0");
        strStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        strStatLbl.setBounds(450,200,70,40);
        strStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(strStatLbl);

        JLabel senStatLbl = new JLabel("0");
        senStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        senStatLbl.setBounds(450,300,70,40);
        senStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(senStatLbl);

        JLabel apStatLbl = new JLabel("0");
        apStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        apStatLbl.setBounds(450,400,70,40);
        apStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(apStatLbl);

        JLabel durStatLbl = new JLabel("0");
        durStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        durStatLbl.setBounds(450,500,70,40);
        durStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(durStatLbl);

    }
}
