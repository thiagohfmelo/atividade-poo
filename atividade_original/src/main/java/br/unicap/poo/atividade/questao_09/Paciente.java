package br.unicap.poo.atividade.questao_09;

public class Paciente {
    private String nome;
    private int idade;
    private String diagnostico;

    public Paciente() {}

    public Paciente(String nome, int idade, String diagnostico) {
        this.nome = nome;
        this.idade = idade;
        this.diagnostico = diagnostico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void exibirPaciente() {
        System.out.println("Paciente: " + nome + ", Idade: " + idade + ", Diagnóstico: " + diagnostico);
    }
}
