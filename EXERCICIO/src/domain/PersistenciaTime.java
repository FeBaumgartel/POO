/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaTime {
    List<Time_futebol>ListaDeTime = new ArrayList<Time_futebol>();
    
    public void save(Time_futebol t){
        if(ListaDeTime.isEmpty()){
            ListaDeTime.add(t);
        }else{
            for(int i=0; i<ListaDeTime.size(); i++){
                Time_futebol a = (Time_futebol) ListaDeTime.get(i);
                if(a.getId() == t.getId()){
                    ListaDeTime.set(i,t);
                    break;
                }else{
                    ListaDeTime.add(t);
                    break;
                }
            }
        }
    }
    
    public void delete(Time_futebol t){
        if(!ListaDeTime.isEmpty()){
            for(int i = 0; i<ListaDeTime.size(); i++){
                Time_futebol a = (Time_futebol) ListaDeTime.get(i);
                if(a.equals(t)){
                    ListaDeTime.remove(i);
                }
            }
        }
    }
    
    public Time_futebol findByID(int id){
        for(int i = 0; i<ListaDeTime.size(); i++){
            Time_futebol a = (Time_futebol) ListaDeTime.get(i);
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    
    public List<Time_futebol> list(){
        return ListaDeTime;
    }
}
