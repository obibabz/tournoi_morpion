package morpion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rousstan
 */
        
        

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class VueInitialisation {
    
    private JFrame window ;
    private int nbjoueurs;
    private JButton moins12 ;
    private JButton plus12 ;
    private JLabel nombrejoueurs;
    private JLabel v1;
    private JComboBox cbox;
    private JTextField saisie;
    
   

    
    public void VueInitialisation() {
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        
        window.setSize(250, 120);
        Dimension dim;
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
        
        JPanel panel = new JPanel(new BorderLayout());
        window.add(panel) ;
        
        JLabel label = new JLabel("choix du nombre de joueurs:");
        panel.add(label);
        saisie = new JTextField(3);
        panel.add(saisie);
           
             
    }
 
    public void afficher(){
        this.window.setVisible(true);
    }

    
}