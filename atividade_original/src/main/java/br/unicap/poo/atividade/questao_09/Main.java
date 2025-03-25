package br.unicap.poo.atividade.questao_09;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("José da Silva", 45, "Hipertensão");
        Paciente p2 = new Paciente("Maria Oliveira", 60, "Diabetes");
        Paciente p3 = new Paciente("Carlos Santos", 50, "Gripe");

        p1.exibirPaciente();
        p2.exibirPaciente();
        p3.exibirPaciente();
    }
}
