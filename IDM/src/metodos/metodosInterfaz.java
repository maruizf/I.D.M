/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JPasswordField;

/**
 *
 * @author ildef
 */
public class metodosInterfaz extends Component {

    public void setImageLabel(JLabel labelName, String ruta) {
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }    
        
         

    public static void mostrarContrasena(JPasswordField passwordField) { 
        if (passwordField.getEchoChar() == '\u2022') {
            // Si la contraseña está oculta, mostrarla
            passwordField.setEchoChar((char) 0);
        } else {
            // Si la contraseña se muestra, ocultarla
            passwordField.setEchoChar('\u2022');
        }
    }
}

