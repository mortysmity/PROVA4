/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico122;

import javax.swing.JOptionPane;

/**
 *
 * @author Meu Computador
 */
public class Basico122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor,x,cont;
        
        cont=1;
        valor=0;
        
       while(cont<=10 ){
        cont++;
        x=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));

       if(x>=0){
          valor++; 
           }
       
          
       
        }
        
       JOptionPane.showMessageDialog(null,"os numeros positivos são: "+valor);
   }
}