package app;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String curso;
    double nota;

    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString() {
        return this.nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
        // Dois alunos são iguais quando os nomes forem iguais
        return this.nome.equals(a.getNome());
    }

    @Override
    public int hashCode() {
        // O hashcode de Aluno será representado pelo hashcode do nome
        return this.nome.hashCode();
    }
}
