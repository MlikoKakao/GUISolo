import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoloGUI extends JFrame {
    private Character character;
    public SoloGUI(){
        super("Solo Leveling");
        character = new Character(0,0,0,0,0);

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



        JLabel intStatLbl = new JLabel(String.valueOf(character.getIntelligence()));
        intStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        intStatLbl.setBounds(450,100,70,40);
        intStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(intStatLbl);

        JButton incIntBt = new JButton("+");
        incIntBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incIntBt.setFont(new Font("Dialog", Font.PLAIN,27));
        incIntBt.setBounds(525,100,50,40);
        incIntBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                character.setIntelligence(character.getIntelligence()+1);
                intStatLbl.setText(String.valueOf(character.getIntelligence()));

            }
        });
        add(incIntBt);

        JLabel strLbl = new JLabel("STR");
        strLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        strLbl.setBounds(50,200,90,40);
        strLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(strLbl);

        JLabel strStatLbl = new JLabel((String.valueOf(character.getStrength())));
        strStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        strStatLbl.setBounds(450,200,70,40);
        strStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(strStatLbl);

        JButton incStrBt = new JButton("+");
        incStrBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incStrBt.setFont(new Font("Dialog", Font.PLAIN,27));
        incStrBt.setBounds(525,200,50,40);
        incStrBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                character.setStrength(character.getStrength()+1);
                strStatLbl.setText(String.valueOf(character.getStrength()));

            }
        });
        add(incStrBt);

        JLabel senLbl = new JLabel("SEN");
        senLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        senLbl.setBounds(50,300,90,40);
        senLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(senLbl);

        JLabel senStatLbl = new JLabel((String.valueOf(character.getSense())));
        senStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        senStatLbl.setBounds(450,300,70,40);
        senStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(senStatLbl);

        JLabel apLbl = new JLabel("APP");
        apLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        apLbl.setBounds(50,400,90,40);
        apLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(apLbl);

        JLabel apStatLbl = new JLabel((String.valueOf(character.getAbility())));
        apStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        apStatLbl.setBounds(450,400,70,40);
        apStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(apStatLbl);

        JLabel durLbl = new JLabel("DUR");
        durLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        durLbl.setBounds(50,500,90,40);
        durLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(durLbl);

        JLabel durStatLbl = new JLabel((String.valueOf(character.getDurability())));
        durStatLbl.setFont(new Font("Dialog", Font.PLAIN,40));
        durStatLbl.setBounds(450,500,70,40);
        durStatLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(durStatLbl);

    }
}
