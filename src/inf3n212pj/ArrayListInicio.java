/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class ArrayListInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());

        nomes.add("Jair");
        System.out.println("Despois de add valor");
        System.out.println("Array está vazio?" + nomes.isEmpty());
        System.out.println("Quantos registros: " + nomes.size());

        System.out.print("Digite um nome: ");
        nomes.add(leia.next());
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(0, "Filispino");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add(3, "Juvenal");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        System.out.println("Index de Jair: " + nomes.indexOf("Jair"));
        nomes.remove("Jair");
        System.out.println("Resultado depois de remover Jair");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        nomes.add("André");
        nomes.add("Silvano");
        nomes.add("Bagre");
        nomes.add("Godzilla");
        System.out.println("Depois de add valor");
        System.out.println("Quantos registros: " + nomes.size());
        System.out.println("Nomes: " + nomes.toString());

        Collections.sort(nomes);
        System.out.println("Array ordenado");
        System.out.println("Nomes: " + nomes.toString());

        Collections.reverse(nomes);
        System.out.println("Array ordem inversa");
        System.out.println("Nomes: " + nomes.toString());

        System.out.println("Impressão em lista");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.print("Digite nome a ser pesquisado: ");
        String pesqNome = leia.next();
        for (String nome : nomes) {
            if (nome.equals(pesqNome)) {
                System.out.println("te encontrei!!!");
                break;
            }
        }
        
        if (pesqNome(nomes, pesqNome)) {
            System.out.println("te acheiii!!!!");
        }else{
            System.out.println("snif, não te achei!!!!");
        }
        

    }//fim da main

    public static boolean pesqNome(ArrayList<String> listaNomes, String nome) {
        for (String listaNome : listaNomes) {
            if (listaNome.equals(nome)) {
                return true;
            }
        }
        return false;
    }//fim pesqNome

}