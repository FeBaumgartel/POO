/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.List;
import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author felipe_baumgartel
 */
public class Persistencia {

    private static List<Aluno> listaDeAluno = new ArrayList<Aluno>();

    public static List<Aluno> list() {
        return listaDeAluno;
    }

    public static void save(Aluno t) {
        if (listaDeAluno.isEmpty()) {
            listaDeAluno.add(t);
        } else {
            for (int i = 0; i < listaDeAluno.size(); i++) {
                Aluno a = (Aluno) listaDeAluno.get(i);
                if (a.getMatricula() == t.getMatricula()) {
                    listaDeAluno.set(i, t);
                    break;
                } else {
                    listaDeAluno.add(t);
                    break;
                }
            }
        }
    }
}
