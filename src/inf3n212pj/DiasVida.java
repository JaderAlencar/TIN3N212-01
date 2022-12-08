/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int idade, diasVida;
        
        System.out.println("Calculo de dias de Vida");
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();
        diasVida = idade * 365;
        System.out.println("Você já viveu " + diasVida + " dias de vida aproximadamente!");
                
    }
    
}
