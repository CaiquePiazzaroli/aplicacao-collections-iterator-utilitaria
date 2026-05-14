package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import app.Aluno;

public class MainComparable {

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

    }
}
