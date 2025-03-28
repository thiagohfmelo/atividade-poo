package br.unicap.poo.atividade.questao20;

public class ReservaDeVoo {
    private String numeroDoVoo;
    private String nomeDoPassageiro;
    private String classe;
    private boolean confirmada;

    public ReservaDeVoo() {}

    public ReservaDeVoo(String numeroDoVoo, String nomeDoPassageiro, String classe) throws IllegalArgumentException {
        if (!classe.equalsIgnoreCase("econômica") && !classe.equalsIgnoreCase("executiva") && !classe.equalsIgnoreCase("primeira classe")) {
            throw new IllegalArgumentException("Classe inválida! Deve ser 'econômica', 'executiva' ou 'primeira classe'.");
        }
        this.numeroDoVoo = numeroDoVoo;
        this.nomeDoPassageiro = nomeDoPassageiro;
        this.classe = classe;
        this.confirmada = false;
    }

    public void alterarClasse(String novaClasse) {
        if (!novaClasse.equalsIgnoreCase("econômica") && !novaClasse.equalsIgnoreCase("executiva") && !novaClasse.equalsIgnoreCase("primeira classe")) {
            throw new IllegalArgumentException("Classe inválida! Deve ser 'econômica', 'executiva' ou 'primeira classe'.");
        }
        this.classe = novaClasse;
    }

    public void cancelarReserva() {
        this.confirmada = false;
        System.out.println("Reserva cancelada.");
    }

    public void confirmarReserva() {
        this.confirmada = true;
        System.out.println("Reserva confirmada!");
    }

    public void exibirDetalhes() {
        System.out.println("Número do Voo: " + numeroDoVoo);
        System.out.println("Nome do Passageiro: " + nomeDoPassageiro);
        System.out.println("Classe: " + classe);
        System.out.println("Status: " + (confirmada ? "Confirmada" : "Pendente"));
    }
}
