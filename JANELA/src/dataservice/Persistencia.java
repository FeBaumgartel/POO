/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import domain.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class Persistencia {

    List<Aluno> ListaDeAluno = new ArrayList<Aluno>();

    public void save(Aluno t) {
        if (ListaDeAluno.isEmpty()) {
            ListaDeAluno.add(t);
        } else {
            for (int i = 0; i < ListaDeAluno.size(); i++) {
                Aluno a = (Aluno) ListaDeAluno.get(i);
                if (a.getCodigo() == t.getCodigo()) {
                    ListaDeAluno.add(i, t);
                    break;
                } else {
                    ListaDeAluno.add(t);
                    break;
                }
            }
        }
    }
}
