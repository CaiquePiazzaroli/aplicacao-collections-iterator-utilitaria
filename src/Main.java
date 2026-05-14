import app.Aluno;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Set<Aluno> conjunto = new HashSet<Aluno>();
//
//        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
//        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
//        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
//        Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
//        conjunto.add(a);
//        conjunto.add(b);
//        conjunto.add(c);
//        conjunto.add(d);
//        System.out.println(conjunto);

        // TreeMap -> ordem ascendente das chaves
        Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0);
        mapa.put("João da Silva", a);
        mapa.put("Antonio Sousa", b);
        mapa.put("Lúcia Ferreira", c);
        mapa.put("Benedito Silva", d);
        mapa.put("Benedito Silva", d); // -> Não pode ser adicionado por ser chave repetida

        System.out.println(mapa);
        System.out.println(mapa.get("Lúcia Ferreira"));


        Collection<Aluno> alunos = mapa.values();
        for (Aluno e : alunos) {
            System.out.println(e);
        }
    }
}
