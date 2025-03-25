package br.unicap.poo.atividade.questao_12;

public class SessaoCinema {
    private String filme;
    private String horario;
    private int capacidadeTotal;
    private int ingressosVendidos;

    public SessaoCinema() {}

    public SessaoCinema(String filme, String horario, int capacidadeTotal, int ingressosVendidos) {
        this.filme = filme;
        this.horario = horario;
        this.capacidadeTotal = capacidadeTotal;
        this.ingressosVendidos = ingressosVendidos;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void venderIngresso() {
        if (ingressosVendidos < capacidadeTotal) {
            ingressosVendidos++;
            System.out.println("Ingresso vendido!");
        } else {
            System.out.println("Não há mais ingressos disponíveis.");
        }
    }

    public void cancelarIngresso() {
        if (ingressosVendidos > 0) {
            ingressosVendidos--;
            System.out.println("Ingresso cancelado!");
        } else {
            System.out.println("Não há ingressos para cancelar.");
        }
    }

    public void exibirInfoSessao() {
        System.out.println("Filme: " + filme + ", Horário: " + horario + ", Ingressos vendidos: " + ingressosVendidos + "/" + capacidadeTotal);
    }

    public void alterarHorario(String novoHorario) {
        this.horario = novoHorario;
        System.out.println("Horário alterado para: " + novoHorario);
    }
}
