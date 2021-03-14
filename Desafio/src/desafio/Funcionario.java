/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author iago_soares
 */
public class Funcionario extends Herança{

   

   public void salario(double Salario, int EleeChefe){
       super.setSalario(Salario + 100);
   }
     
   public void salario (double salario){
       this.salario = salario;
   }
}
