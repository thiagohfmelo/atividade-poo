package br.unicap.poo.atividade.questao17;

public class Votacao {
    private String candidato;
    private int votosRecebidos;

    public Votacao(String candidato) {
        this.candidato = candidato;
        this.votosRecebidos = 0;
    }

    public void adicionarVoto() {
        votosRecebidos++;
    }

    public void zerarVotos() {
        votosRecebidos = 0;
    }

    public void exibirResultado() {
        System.out.println("Candidato: " + candidato + " - Votos: " + votosRecebidos);
    }

    public void compararVotos(Votacao outraVotacao) {
        if (this.votosRecebidos > outraVotacao.votosRecebidos) {
            System.out.println(this.candidato + " tem mais votos.");
        } else if (this.votosRecebidos < outraVotacao.votosRecebidos) {
            System.out.println(outraVotacao.candidato + " tem mais votos.");
        } else {
            System.out.println("Empate!");
        }
    }
}