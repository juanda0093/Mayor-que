/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_3_laboratorio1modificado;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Parcial_3_laboratorio1modificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero otro numero"));

        if (a > b) {
            System.err.println("El número " + b + " es igual que " + a);
        } else {
            System.err.println("El número " + a + " es diferente que " + b);
        }
        
        System.err.println("a");
        System.err.println("s");
        System.err.println("w");
        System.err.println("Hola david");
        System.err.println("...");
        System.err.println("..");
    }
    
}
