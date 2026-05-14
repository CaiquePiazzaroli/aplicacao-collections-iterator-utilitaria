package examples;

import app.Aluno;
import app.ComparadorAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {

        // Exemplo 2: Usando Comparator
        List<Aluno> lista2 = new ArrayList<>();
        Aluno a1 = new Aluno("Sebastião da Silva Pinto", "Excel", 0);
        Aluno b1 = new Aluno("Maria Vera do Carmo", "Fisica Aplicada", 0);
        Aluno c1 = new Aluno("Kaique Ribeiro", "Quimica", 0);
        lista2.add(a1);
        lista2.add(b1);
        lista2.add(c1);

        // Comparação por meio da interface Comparator
        ComparadorAluno ca = new ComparadorAluno();
        System.out.println("Lista2 Antes: " + lista2);
        Collections.sort(lista2, ca); // Utiliza-se de uma classe adicional que implementa Comparator
        System.out.println("Lista2 Depois: " + lista2);

    }
}
