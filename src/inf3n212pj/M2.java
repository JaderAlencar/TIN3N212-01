/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n21pj;

import java.util.Scanner;

/**
 *
 * @author 182120013
 */
public class M2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n ;
                System.out.println("Calculadora de notas escolares");
        System.out.println("Por favor, insira o numero de notas a serem calculçadas: ");
        n = leiaInt();
        float notas[] = new float[n+1];
        for (int i = 0; i < (n); i++) {
            do {
                System.out.print("Insira a " + (i + 1) + "° nota:");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota invalida!");
                }
            } while (validaNota(notas[i]));
            notas[n] += notas[i];
        }
        notas[n] = notas[n] / 4;
        System.out.printf("A média do aluno é: ", notas[4]);
        if (notas[n] >= 6) {
            System.out.println("\nO aluno está aprovado!?!");
        } else {
            System.out.println("\nO aluno está reprovado?!?");
        }

    }//fim da Varzea

    public static boolean validaNota(float nota) {

        return nota < 0 || nota > 10;
    }//fim do valida nota

    public static float leiaFloat() {
        try{
        Scanner leia = new Scanner(System.in);
        return leia.nextFloat();
        }catch(Exception e){
            System.out.println(e.getMessage()+"Erro: ");
            System.out.println("Corrija o valor inserido: ");
            return leiaFloat();
        }
    }//fim do leia float

    private static int leiaInt() {
        Scanner leia = new Scanner(System.in); 
        return leia.nextInt();}//To change body of generated methods, choose Tools | Templates.
    }

   

   
