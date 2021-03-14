package Exemplo1;

public class Tester {

    public static void main(String[] args) {

        Persistencia per = new Persistencia();

        //Exemplo Save
        System.out.println("Save");
        Aluno a3 = new Aluno(02, "Daniel Pedrotti", 12345678, Sexo.MASCULINO,
                "danielpedrottiredes@gmail.com", "endereco");
        per.save(a3);
        System.out.println(per.list());

        //Exemplo Update
        System.out.println("Update");
        Aluno a1 = new Aluno(01, "Naiara", 1234567, Sexo.FEMININO,
                "naiaragomessp@gmail.com", "endereco");
        per.save(a1);
        System.out.println(per.list());

        Aluno a2 = new Aluno(01, "Naiara Gomes Pimenta", 1234567, Sexo.FEMININO,
                "naiaragomessp@gmail.com", "endereco");
        per.save(a2);
        System.out.println(per.list());

        //Exemplo Seleção por ID
        System.out.println("Select");
        per.findByID(02);

        //Exemplo Delete
        System.out.println("Delete");
        per.delete(a1);
        System.out.println(per.list());
    }
}
