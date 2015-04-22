/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ryancorbin
 */
public class Startup {
        private static final String ERROR_WINDOW_TITLE = "Error";
        private static final String UNAVAILABLE_ERROR = "The System look and feel is "
            + "unavailable. Using default instead.";

    /**
     * Creates a GUI with the system look and feel.  Throws a JOptionPane if it can't
     * find it.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, ERROR_WINDOW_TITLE,
                    UNAVAILABLE_ERROR, JOptionPane.ERROR_MESSAGE);     
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TempConverterGui().setVisible(true);
        });
    }
    
}
