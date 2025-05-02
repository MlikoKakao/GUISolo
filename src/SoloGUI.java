import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoloGUI extends JFrame {
    private Character character;
    int points = 5;
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

        JLabel availablePointsLbl = new JLabel("Available points: "+String.valueOf(points));
        availablePointsLbl.setFont(new Font("Dialog", Font.PLAIN,25));
        availablePointsLbl.setBounds(150,600,250,40);
        availablePointsLbl.setBorder(BorderFactory.createLineBorder(Color.black));
        add(availablePointsLbl);

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
                if(points > 0) {
                    character.setIntelligence(character.getIntelligence() + 1);
                    intStatLbl.setText(String.valueOf(character.getIntelligence()));
                    points--;
                    availablePointsLbl.setText("Available points: "+String.valueOf(points));
                }
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
                if(points > 0) {
                    character.setStrength(character.getStrength() + 1);
                    strStatLbl.setText(String.valueOf(character.getStrength()));
                    points--;
                    availablePointsLbl.setText("Available points: "+String.valueOf(points));
                }
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

        JButton incSenBt = new JButton("+");
        incSenBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incSenBt.setFont(new Font("Dialog", Font.PLAIN,27));
        incSenBt.setBounds(525,300,50,40);
        incSenBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points > 0) {
                    character.setSense(character.getSense() + 1);
                    senStatLbl.setText(String.valueOf(character.getSense()));
                    points--;
                    availablePointsLbl.setText("Available points: "+String.valueOf(points));
                }
            }
        });
        add(incSenBt);

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

        JButton incAPBt = new JButton("+");
        incAPBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incAPBt.setFont(new Font("Dialog", Font.PLAIN,27));
        incAPBt.setBounds(525,400,50,40);
        incAPBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points > 0) {
                    character.setAbility(character.getAbility() + 1);
                    apStatLbl.setText(String.valueOf(character.getAbility()));
                    points--;
                    availablePointsLbl.setText("Available points: "+String.valueOf(points));
                }
            }
        });
        add(incAPBt);

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

        JButton incDurBt = new JButton("+");
        incDurBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        incDurBt.setFont(new Font("Dialog", Font.PLAIN,27));
        incDurBt.setBounds(525,500,50,40);
        incDurBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(points >0) {
                    character.setDurability(character.getDurability() + 1);
                    durStatLbl.setText(String.valueOf(character.getDurability()));
                    points--;
                    availablePointsLbl.setText("Available points: "+String.valueOf(points));
                }
            }
        });
        add(incDurBt);

        JButton addPointsBt = new JButton("A");
        addPointsBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addPointsBt.setFont(new Font("Dialog", Font.PLAIN,27));
        addPointsBt.setBounds(425,600,60,40);
        addPointsBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                points++;
                availablePointsLbl.setText("Available points: "+String.valueOf(points));
            }
        });
        add(addPointsBt);


        JButton resetBt = new JButton("R");
        resetBt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        resetBt.setFont(new Font("Dialog", Font.PLAIN,27));
        resetBt.setBounds(500,600,60,40);
        resetBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                points=5;
                availablePointsLbl.setText("Available points: "+String.valueOf(points));
                character.setDurability(0);
                durStatLbl.setText(String.valueOf(character.getDurability()));

                character.setIntelligence(0);
                intStatLbl.setText(String.valueOf(character.getIntelligence()));

                character.setStrength(0);
                strStatLbl.setText(String.valueOf(character.getStrength()));

                character.setSense(0);
                senStatLbl.setText(String.valueOf(character.getSense()));

                character.setAbility(0);
                apStatLbl.setText(String.valueOf(character.getAbility()));
            }
        });
        add(resetBt);
    }
}
