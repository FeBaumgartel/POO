/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal {

    static Aluno[] aluno = new Aluno[99999];

    static int id;
    static int op2;
    static String lista1 = "";

    public static void main(String[] args) {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:"
                    + "\n0 - Sair"
                    + "\n1 - Cadastrar Aluno"
                    + "\n2 - Alterar Aluno"
                    + "\n3 - Deletar Aluno"
                    + "\n4 - Listar Aluno"));
            if (op == 1) {
                Cadastro();
            } else if (op == 2) {
                Alteração();
            } else if (op == 3) {
                Exclusão();
            } else if (op == 4) {
                Listagem();
            }
        } while (op != 0);
    }

    static void Cadastro() {
        for (int i = 0; i < 99999; i++) {
            if (aluno[i] == null) {
                aluno[i] = new Aluno();
                aluno[i].setId(i + 1);
                aluno[i].setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                aluno[i].setCpf(JOptionPane.showInputDialog("Digite o CPF do aluno"));
                aluno[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
                aluno[i].setEndereco(JOptionPane.showInputDialog("Digite o endereço do aluno"));
                aluno[i].setNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno"));
                aluno[i].setSexo(JOptionPane.showInputDialog("Digite o sexo do aluno"));

                JOptionPane.showMessageDialog(null, "O aluno foi cadastrado com o código: " + aluno[i].getId());

                lista1 += "Aluno: " + aluno[i].getNome() + "          Código: " + aluno[i].getId() + "\n";

                break;
            }
        }
    }

    static void Alteração() {
        JOptionPane.showMessageDialog(null, lista1);
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno que deseja realizar "
                + "alguma alteração"));

        do {
            op2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção que deseja:"
                    + "\n0 - Sair"
                    + "\n1 - Nome"
                    + "\n2 - CPF"
                    + "\n3 - Idade"
                    + "\n4 - Endereço"
                    + "\n5 - Data de Nascimento"
                    + "\n6 - Sexo"));

            if (op2 == 1) {
                aluno[id - 1].setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                break;
            }
            if (op2 == 2) {
                aluno[id - 1].setCpf(JOptionPane.showInputDialog("Digite o CPF do aluno"));
                break;
            }
            if (op2 == 3) {
                aluno[id - 1].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
                break;
            }
            if (op2 == 4) {
                aluno[id - 1].setEndereco(JOptionPane.showInputDialog("Digite o endereco do aluno"));
                break;
            }
            if (op2 == 5) {
                aluno[id - 1].setNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do aluno"));
                break;
            }
            if (op2 == 6) {
                aluno[id - 1].setSexo(JOptionPane.showInputDialog("Digite o sexo do aluno"));
                break;
            }
        } while (op2 != 0);
    }

    static void Exclusão() {
        JOptionPane.showMessageDialog(null, lista1);
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno que deseja realizar "
                + "a exclusão"));
        aluno[id - 1] = null;
    }

    static void Listagem() {
        JOptionPane.showMessageDialog(null, lista1);
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno que deseja realizar "
                + "a listagem"));
        JOptionPane.showMessageDialog(null, "Nome do aluno: " + aluno[id - 1].getNome()
                + "\nCPF do aluno" + aluno[id - 1].getCpf()
                + "\nIdade do aluno" + aluno[id - 1].getIdade()
                + "\nEndereço do aluno" + aluno[id - 1].getEndereco()
                + "\nData de nascimento do aluno" + aluno[id - 1].getNascimento()
                + "\nSexo do aluno" + aluno[id - 1].getSexo());
    }
}
