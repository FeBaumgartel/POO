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
public class PersistenciaProduto {
    
    List<Produto>ListaDeProduto = new ArrayList<Produto>();
    
    public void save(Produto t){
        if(ListaDeProduto.isEmpty()){
            ListaDeProduto.add(t);
        }else{
            for(int i=0; i<ListaDeProduto.size(); i++){
                Produto a = (Produto) ListaDeProduto.get(i);
                if(a.getId() == t.getId()){
                    ListaDeProduto.add(i,t);
                    break;
                }else{
                    ListaDeProduto.add(t);
                    break;
                }
            }
        }
    }
    
    public void delete(Produto t){
        if(!ListaDeProduto.isEmpty()){
            for(int i = 0; i<ListaDeProduto.size(); i++){
                Produto a = (Produto) ListaDeProduto.get(i);
                if(a.equals(t)){
                    ListaDeProduto.remove(i);
                }
            }
        }
    }
    
    public Produto findByID(int id){
        for(int i = 0; i<ListaDeProduto.size(); i++){
            Produto a = (Produto) ListaDeProduto.get(i);
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    
    public List<Produto> list(){
        return ListaDeProduto;
    }
}
