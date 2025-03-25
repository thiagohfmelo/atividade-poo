package br.unicap.poo.atividade.questao_05;

public class Main {
    public static void main(String[] args) {
        Reserva r1 = new Reserva("João", "Suíte", 3);
        Reserva r2 = new Reserva("Maria", "Duplo", 5);
        Reserva r3 = new Reserva("Pedro", "Simples", 2);

        r1.exibirReserva();
        r2.exibirReserva();
        r3.exibirReserva();
    }
}
