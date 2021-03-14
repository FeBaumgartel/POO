
package Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Persistencia {
    
    List<Aluno>ListaDeAluno = new ArrayList<Aluno>();
    
    public void save(Aluno t){
        if(ListaDeAluno.isEmpty()){
            ListaDeAluno.add(t);
        }else{
            for(int i=0; i<ListaDeAluno.size(); i++){
                Aluno a = (Aluno) ListaDeAluno.get(i);
                if(a.getMatricula() == t.getMatricula()){
                }else{
                    ListaDeAluno.add(t);
                }
            }
        }
    }
    
    public void delete(Aluno t){
        if(!ListaDeAluno.isEmpty()){
            for(int i = 0; i<ListaDeAluno.size(); i++){
                Aluno a = (Aluno) ListaDeAluno.get(i);
                if(a.equals(t)){
                    ListaDeAluno.remove(i);
                }
            }
        }
    }
    
    public Aluno findByID(int id){
        for(int i = 0; i<ListaDeAluno.size(); i++){
            Aluno a = (Aluno) ListaDeAluno.get(i);
            if(a.getMatricula() == id){
                System.out.println(a);
                return a;
            }
        }
        return null;
    }
    
    public List<Aluno> list(){
        return ListaDeAluno;
    }
}
