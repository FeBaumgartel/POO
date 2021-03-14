/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import javax.swing.JOptionPane;

/**
 *
 * @author iago_soares
 */
public class EncapPrincipal {
    
    public static void main(String[] args) {
     
        int EleeChefe = 0;
        Funcionario f = new Funcionario ();
        
        
        EleeChefe = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 sefor um chefe e 2 se não for :"));
        f.setNome(JOptionPane.showInputDialog("Nome: "));
        f.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        f.setCPF(JOptionPane.showInputDialog("CPF: "));
        f.setRG(Integer.parseInt(JOptionPane.showInputDialog("RG: ")));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario: ")));
        
        if(EleeChefe == 1){  f.salario(f.getSalario(), EleeChefe);  }
        if(EleeChefe == 2){ f.salario(f.getSalario());}
        
        JOptionPane.showMessageDialog(null,"Salario: "+ f.getSalario());
    }
           
}
