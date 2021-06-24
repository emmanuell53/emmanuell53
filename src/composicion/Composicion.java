/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.objetos.Muro;
import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import java.awt.Color;
import ico.fes.objetos.PuertaDeSeguridad;

/**
 *
 * @author LENOVO
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muro m1 = new Muro(2.5f, 4.5f, 3.5f, Color.gray, null, new Puerta("Madera", Color.white, false));
        System.out.println(m1.getAlto() + " mts. de alto");
        System.out.println(m1.getPuerta().getMaterial());
        System.out.println(m1);
        //Ccambiar material de la puerta
        m1.getPuerta().setMaterial("Aluminio");
        //Cambiar color de la puerta
        m1.getPuerta().setColor(Color.blue);
        // Cambiar ventana
        Ventana ventanas[] = new Ventana[1];
        ventanas[0] = new Ventana("Aluminio", Color.blue, 5, 10);
        m1.setVentanas(ventanas);
        m1.getVentanas();
        System.out.println("Ya con modificaciones: " + m1);
        
        
        System.out.println(".-.-.-.-.-HErencia.-.-.-.-.--..-.-");
        PuertaDeSeguridad puerta1=new PuertaDeSeguridad();
        puerta1.setColor(Color.yellow);
        puerta1.cerrar();
        System.out.println(puerta1);
        

    }

}
