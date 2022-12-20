/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author 182120009
 */
public class CadAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Aluno juca = new Aluno(123, "321", "Juca Bala", "Masculino",
                55, "519998899988", true, "Vai saber");
        System.out.println("Aluno: " + juca.toString());

        System.out.println("Nome:" + juca.getNome());
        juca.setNome("Juca Bala das Candongas");
        System.out.println("Aluno:" + juca.toString());

        //Criar novo objeto aluno com seus dados logo abaixo:.
        Aluno jader = new Aluno(182120009, "01888894008", "Jader Costa", "Masculino",
                36, "51989391915", true, "Eurico Lara 51");
        System.out.println("Aluno: " + jader.toString());

        System.out.println("Nome:" + jader.getNome());
        juca.setNome("Jader Costa");
        System.out.println("Aluno:" + jader.toString());

        //Criar novo aluno utilizando a leitura no console pelo scanner
        Scanner leia = new Scanner(System.in);
                
        int matricula;
        String cpf;
        String nome;
        String sexo;
        int idade;
        String telefone;
        boolean status;
        String endereco;
        
        System.out.print("Informe a matricula:");
        matricula = leia.nextInt();
        leia.nextLine();
        
        System.out.print("Informe o CPF:");
        cpf = leia.nextLine();
        
        System.out.print("Informe nome:");
        nome = leia.nextLine();
        
        System.out.print("Informe o sexo (M/F):");
        sexo = leia.nextLine();
        
        System.out.print("Informe idade:");
        idade = leia.nextInt();
        leia.nextLine();
        
        System.out.print("Informe o telefone:");
        telefone = leia.nextLine();
        
        System.out.print("Informe o endereço:");
        endereco = leia.nextLine();
        
        System.out.println("Aluno ativo? Digite> 1 Sim | 2 Não:");
        int valorStatus = leia.nextInt();
        
        if(valorStatus==1){
            status = true;
            
        }else{
            status = false;
            
        }
        Aluno aluno1 = new Aluno(matricula, cpf, nome, sexo, idade, telefone, status, endereco);
        System.out.println("Aluno1: " + aluno1.toString());
        
        

    }//Fim da main

}
