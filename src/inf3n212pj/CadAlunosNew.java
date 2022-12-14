/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author 182120009
 */
public class CadAlunosNew {

    static ArrayList<Aluno> alunos = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opM;
        do {
            menu();
            opM = leiaInt();
            switch (opM) {
                case 1:
                    cadAluno();
                    break;
                case 2:
                    break;
                case 3:
                    imprimeAlunos();
                    break;
                case 4:
                    deletarAluno();
                    break;
                case 5:
                    imprimeAlunosAtivos();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada!");
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opM != 0);

    }//Fim main    // TODO code application logic here

    public static void menu() {

        System.out.println(".:Sistema de Alunos:.");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Editar Aluno");
        System.out.println("3 - Imprimir Todos Aluno");
        System.out.println("4 - Deletar/Inativar Aluno");
        System.out.println("5 - Imprimir Alunos Ativos");
        System.out.println("0 - Sair");
        System.out.println("digite aqui");

    }//Fim menu

    public static void cadAluno() {
        System.out.println("Cadastro de Aluno");
        System.out.println("Digite o CPF do aluno");
        String cpf = leia.next();
        if (!verCPF(cpf)) {//serve para negar o retorno do ver CPF
            System.out.println("Digite a matricula:");
            int matricula = leiaInt();
            System.out.println("Informe o nome:");
            String nome = leia.next();
            System.out.println("Informe o sexo");
            String sexo = leia.next();
            System.out.println("Informe idade:");
            int idade = leiaInt();
            System.out.println("Informe o telefone:");
            String telefone = leia.next();
            boolean status = true;
            System.out.println("Informe o endereço:");
            String endereco = leia.nextLine();
            Aluno a = new Aluno(matricula, cpf, nome, sexo, idade, telefone, status, endereco);
            alunos.add(a);

        } else {
            System.out.println(cpf + " já existe!");
            
        }

    }//Fim cadAluno

    public static boolean verCPF(String cpf) {
        for (Aluno aluno : alunos) {//For para percorrer objeto

            if (aluno.getCpf().equals(cpf)) {

                return true;
            }

        }

        return false;

    } //Fim verCPF

    public static int leiaInt() {

        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextInt();

        } catch (Exception e) {
            System.out.println("Valor inserido inválido, tente novamente: ");
            return leiaInt();

        }//Fim exception

    }//Fim leiaInt

    public static void imprimeAlunos() {
        System.out.println("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista vazia!");

        } else {
            for (Aluno aluno : alunos) {
                System.out.println(alunos.toString());

            }

        }

    }//Fim do imprimeAlunos

    public static void imprimeAlunosAtivos() {
        System.out.println("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista vazia!");

        } else {
            for (Aluno aluno : alunos) {
                if (aluno.isStatus()) {
                    System.out.println(alunos.toString());
                }
            }
        }
    }//Fim do impremeAlunosAtivos

    public static Aluno getAluno(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;

            }

        }

        return null;

    }//Fim getAluno

    public static void deletarAluno() {
        System.out.println("Deletar/Inativar aluno");
        System.out.println("Informe o CPF");
        String cpf = leia.nextLine();
        if (verCPF(cpf)) {
            System.out.println("1 - Deletar \n2 - Inativar");
            System.out.println("Digete:");
            int op = leiaInt();
            if (op == 1) {
                alunos.remove(getAluno(cpf));
                System.out.println("Aluno com CPF " + cpf + " Deletado com sucesso!");
            } else if (op == 2) {
                getAluno(cpf).setStatus(false);
                System.out.println("Aluno " + getAluno(cpf).getNome() + " inativado.");

            }
        } else {
            System.out.println("Aluno não encontrado!");
        }

    }//Fim deletarAluno

}
