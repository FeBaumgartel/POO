/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaFuncionario {
    
    List<Funcionario>ListaDeFuncionario = new ArrayList<Funcionario>();
    
    public void save(Funcionario t){
        if(ListaDeFuncionario.isEmpty()){
            ListaDeFuncionario.add(t);
        }else{
            for(int i=0; i<ListaDeFuncionario.size(); i++){
                Funcionario a = (Funcionario) ListaDeFuncionario.get(i);
                if(a.getMatricula() == t.getMatricula()){
                    ListaDeFuncionario.set(i,t);
                    break;
                }else{
                    ListaDeFuncionario.add(t);
                    break;
                }
            }
        }
    }
    
    public void delete(Funcionario t){
        if(!ListaDeFuncionario.isEmpty()){
            for(int i = 0; i<ListaDeFuncionario.size(); i++){
                Funcionario a = (Funcionario) ListaDeFuncionario.get(i);
                if(a.equals(t)){
                    ListaDeFuncionario.remove(i);
                }
            }
        }
    }
    
    public Funcionario findByID(int id){
        for(int i = 0; i<ListaDeFuncionario.size(); i++){
            Funcionario a = (Funcionario) ListaDeFuncionario.get(i);
            if(a.getMatricula() == id){
                return a;
            }
        }
        return null;
    }
    
    public List<Funcionario> list(){
        return ListaDeFuncionario;
    }
}
