
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dod.conselec;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.GroupLayout.Group;
public class Fenetre extends JFrame{
    
    private JPanel mainPanel = new JPanel();
    private JComboBox listAppareil = new JComboBox();
    private JTextField heuresField = new JTextField();
    private JRadioButton radioDollar = new JRadioButton("$");
    private JRadioButton radioEuro = new JRadioButton("€");
    private JRadioButton radioCHF = new JRadioButton("CHF");
    private JTextField fieldResultat = new JTextField();
    private JButton calculButton = new JButton("CALCUL");

    public Fenetre(){
        this.setTitle("DojoCalc");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        
        
        mainPanel.setLayout(new GridLayout(15,1));
        this.setContentPane(mainPanel);
        
        
        listAppareil.addItem("Choisir...");
        listAppareil.addItem("Fer à repasser");
        listAppareil.addItem("Aspirateur");
        listAppareil.addItem("Radio reveil");
        listAppareil.addItem("Télévision");
        listAppareil.addItem("Ordinateur");
        ButtonGroup group = new ButtonGroup();
        group.add(radioDollar);
        group.add(radioEuro);
        group.add(radioCHF);
        
        mainPanel.add(listAppareil);
        mainPanel.add(heuresField);
        
        mainPanel.add(radioDollar);
        mainPanel.add(radioEuro);
        mainPanel.add(radioCHF);
        
        calculButton.addActionListener(new calcListener());
        
        fieldResultat.setEditable(false);
        fieldResultat.setText(calcul());
        mainPanel.add(fieldResultat);
        mainPanel.add(calculButton);
        
        this.setVisible(true);
        
    }
    
    public String calcul() {
        return "test";
    }
    
    public static void infoBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: Information", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void errorBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: Erreur" , JOptionPane.ERROR_MESSAGE);
    }
    public static void warBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: Warning", JOptionPane.WARNING_MESSAGE);
    }
    class calcListener implements ActionListener{
        // String champEntre = heuresField.getText();
        public void actionPerformed(ActionEvent e){
            if(listAppareil.getSelectedIndex() == 0){
                warBox("Aucun appareil n'a ete selectionne");
            }
            try{
                               int champEntre = Integer.parseInt(heuresField.getText());

            
            }catch(NumberFormatException ex){
                errorBox(ex.toString());
            }
                 
        }
}
}
