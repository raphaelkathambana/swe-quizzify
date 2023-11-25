package quizzify.unused;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.SwingUtilities;
import quizzify.EntryPage;

/**
 *
 * @author austi
 */
public class Quizzify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EntryPage().setVisible(true));
    }
    
}
