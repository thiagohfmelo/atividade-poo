package br.unicap.poo.atividade.questao14;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private int prioridade;

    public Tarefa() {}

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public boolean isConcluida() { return concluida; }
    public void concluirTarefa() { this.concluida = true; }

    public int getPrioridade() { return prioridade; }
    public void mudarPrioridade(int novaPrioridade) { this.prioridade = novaPrioridade; }

    public void resetarTarefa() { this.concluida = false; }

    public void exibirTarefa() {
        System.out.println("Descrição: " + descricao + ", Concluída: " + concluida + ", Prioridade: " + prioridade);
    }
}
