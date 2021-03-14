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
public class PersistenciaCliente {
    
    List<Cliente>ListaDeCliente = new ArrayList<Cliente>();
    
    public void save(Cliente t){
        if(ListaDeCliente.isEmpty()){
            ListaDeCliente.add(t);
        }else{
            for(int i=0; i<ListaDeCliente.size(); i++){
                Cliente a = (Cliente) ListaDeCliente.get(i);
                if(a.getId() == t.getId()){
                    ListaDeCliente.add(i, t);
                    break;
                }else{
                    ListaDeCliente.add(t);
                    break;
                }
            }
        }
    }
    
    public void delete(Cliente t){
        if(!ListaDeCliente.isEmpty()){
            for(int i = 0; i<ListaDeCliente.size(); i++){
                Cliente a = (Cliente) ListaDeCliente.get(i);
                if(a.equals(t)){
                    ListaDeCliente.remove(i);
                }
            }
        }
    }
    
    public Cliente findByID(int id){
        for(int i = 0; i<ListaDeCliente.size(); i++){
            Cliente a = (Cliente) ListaDeCliente.get(i);
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    
    public List<Cliente> list(){
        return ListaDeCliente;
    }
}
