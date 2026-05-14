import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // Exemplo 1: Comparação com inteface Comparable
        List<Aluno> lista1 = new ArrayList<>();
        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista1.add(a);
        lista1.add(b);
        lista1.add(c);

        // Comparaçao por interface Comparable
        System.out.println("Lista1 Antes: " + lista1);
        Collections.sort(lista1);
        System.out.println("Lista1 Depois: " + lista1);// Lista ordenada por compareTo implementada na classe



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
