/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Principal {
//variáveis

    static int op1;
    static int op2;
    static int id;
    static int idfuncionario = 0;
    static int idcliente = 0;
    static int idproduto = 0;
//declaração persistências
    static PersistenciaFuncionario perF = new PersistenciaFuncionario();
    static PersistenciaCliente perC = new PersistenciaCliente();
    static PersistenciaProduto perP = new PersistenciaProduto();

    public static void main(String[] args) {
//menu principal
        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha:"
                    + "\n0-SAIR"
                    + "\n1-Cadastrar"
                    + "\n2-Alterar"
                    + "\n3-Deletar"
                    + "\n4-Listar"));

            if (op1 == 1) {
                Menu();
                if (op2 == 1) {
//cadastro funcionário
                    idfuncionario++;
                    Funcionario func = new Funcionario(
                            idfuncionario,
                            JOptionPane.showInputDialog("Digite o nome do funcionário"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do funcionário")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário")),
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário")),
                            JOptionPane.showInputDialog("Digite o endereço do funcionário"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o telefone do funcionário")));
                    JOptionPane.showMessageDialog(null, "Identificação: " + idfuncionario);
                    perF.save(func);
                } else if (op2 == 2) {
//cadastro cliente                    
                    idcliente++;
                    Cliente client = new Cliente(
                            idcliente,
                            JOptionPane.showInputDialog("Digite o nome do cliente"),
                            JOptionPane.showInputDialog("Digite o RG do cliente"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente")),
                            JOptionPane.showInputDialog("Digite o sexo do cliente"),
                            JOptionPane.showInputDialog("Digite o endereço do cliente"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o telefone do cliente")));
                    JOptionPane.showMessageDialog(null, "Identificação: " + idcliente);
                    perC.save(client);
                } else if (op2 == 3) {
//cadastro produto                    
                    idproduto++;
                    Produto prod = new Produto(
                            idproduto,
                            JOptionPane.showInputDialog("Digite o nome do produto"),
                            JOptionPane.showInputDialog("Digite uma descrição para o produto"),
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto em estoque")));
                    JOptionPane.showMessageDialog(null, "Identificação: " + idproduto);
                    perP.save(prod);
                }
            } else if (op1 == 2) {
                Menu();
                if (op2 == 1) {
//alteração funcionário                    
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do funcionário "
                            + "que deseja realizar as alterações"));
                    Funcionario func = new Funcionario(
                            id,
                            JOptionPane.showInputDialog("Digite o nome do funcionário"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do funcionário")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário")),
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário")),
                            JOptionPane.showInputDialog("Digite o endereço do funcionário"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o telefone do funcionário"))
                    );
                    perF.save(func);
                } else if (op2 == 2) {
//alteração cliente                    
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do cliente "
                            + "que deseja realizar as alterações"));
                    Cliente client = new Cliente(
                            id,
                            JOptionPane.showInputDialog("Digite o nome do cliente"),
                            JOptionPane.showInputDialog("Digite o RG do cliente"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente")),
                            JOptionPane.showInputDialog("Digite o sexo do cliente"),
                            JOptionPane.showInputDialog("Digite o endereço do cliente"),
                            Long.parseLong(JOptionPane.showInputDialog("Digite o telefone do cliente")));
                    perC.save(client);
                } else if (op2 == 3) {
//alteração produto                    
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do produto "
                            + "que deseja realizar as alterações"));
                    Produto prod = new Produto(
                            id,
                            JOptionPane.showInputDialog("Digite o nome do produto"),
                            JOptionPane.showInputDialog("Digite uma descrição para o produto"),
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto em estoque")));
                    perP.save(prod);
                }
            }
            if (op1 == 3) {
                Menu();
                if (op2 == 1) {
//exclusão funcionário                    
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do funcionátio"
                            + "que deseja realizar a exclusão"));
                    Funcionario func = perF.findByID(id);
                    perF.delete(func);
                }
                if (op2 == 2) {
//exclusão cliente
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do cliente"
                            + "que deseja realizar a exclusão"));
                    Cliente client = perC.findByID(id);
                    perC.delete(client);
                } else if (op2 == 3) {
//exclusão produto                    
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite a identificação do produto"
                            + "que deseja realizar a exclusão"));
                    Produto prod = perP.findByID(id);
                    perP.delete(prod);
                }
            }
            if (op1 == 4) {
                Menu();
                if (op2 == 1) {
//listagem funcionário                    
                    String imp = "";
                    List<Funcionario> func = perF.list();

                    for (int i = 0; i < func.size(); i++) {
                        imp += func.get(i);
                    }
                    JOptionPane.showMessageDialog(null, imp);
                } else if (op2 == 2) {
//listagem cliente
                    String imp = "";
                    List<Cliente> client = perC.list();

                    for (int i = 0; i < client.size(); i++) {
                        imp += client.get(i);
                    }
                    JOptionPane.showMessageDialog(null, imp);
                } else if (op2 == 3) {
//listagem produto                   
                    String imp = "";
                    List<Produto> prod = perP.list();

                    for (int i = 0; i < prod.size(); i++) {
                        imp += prod.get(i);
                    }
                    JOptionPane.showMessageDialog(null, imp);
                }
            }
        } while (op1 != 0);
    }
//menu de escolha de entidade

    static void Menu() {
        op2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha a entidade que deseja "
                + "realiazar a operação:"
                + "\n0-SAIR"
                + "\n1-Funcionário"
                + "\n2-Cliente"
                + "\n3-Produto"));
    }
}
