package examples;

import app.Aluno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void main(String[] args) {
        // Exemplo 3 Utilizando Iterator
        List<Aluno> lista3 = new ArrayList<>();
        Aluno a2 = new Aluno("Marcelo Almeida", "Informática Basica", 0);
        Aluno b2 = new Aluno("Adriana Pereira da Silva", "Física Quântica", 0);
        Aluno c2 = new Aluno("Denilson Milagroso Pereira", "Biologia", 0);
        lista3.add(a2);
        lista3.add(b2);
        lista3.add(c2);

        Aluno aluno;
        Iterator<Aluno> itr = lista3.iterator();
        while (itr.hasNext()) {
            aluno = itr.next();
            System.out.println(aluno.getNome());
        }
    }
}
