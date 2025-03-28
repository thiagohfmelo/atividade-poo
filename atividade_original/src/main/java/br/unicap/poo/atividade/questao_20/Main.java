package br.unicap.poo.atividade.questao20;

public class Main {
    public static void main(String[] args) {
        try {
            ReservaDeVoo reserva1 = new ReservaDeVoo("12345", "Carlos Silva", "econômica");
            ReservaDeVoo reserva2 = new ReservaDeVoo("67890", "Maria Oliveira", "executiva");

            reserva1.confirmarReserva();
            reserva2.cancelarReserva();

            reserva1.exibirDetalhes();
            System.out.println("----------------");
            reserva2.exibirDetalhes();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
