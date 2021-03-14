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
public class PersistenciaJogador {
    List<Jogador>ListaDeJogador = new ArrayList<Jogador>();
    
    public void save(Jogador t){
        if(ListaDeJogador.isEmpty()){
            ListaDeJogador.add(t);
        }else{
            for(int i=0; i<ListaDeJogador.size(); i++){
                Jogador a = (Jogador) ListaDeJogador.get(i);
                if(a.getId() == t.getId()){
                    ListaDeJogador.set(i,t);
                    break;
                }else{
                    ListaDeJogador.add(t);
                    break;
                }
            }
        }
    }
    
    public void delete(Jogador t){
        if(!ListaDeJogador.isEmpty()){
            for(int i = 0; i<ListaDeJogador.size(); i++){
                Jogador a = (Jogador) ListaDeJogador.get(i);
                if(a.equals(t)){
                    ListaDeJogador.remove(i);
                }
            }
        }
    }
    
    public Jogador findByID(int id){
        for(int i = 0; i<ListaDeJogador.size(); i++){
            Jogador a = (Jogador) ListaDeJogador.get(i);
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    
    public List<Jogador> list(){
        return ListaDeJogador;
    }
}
