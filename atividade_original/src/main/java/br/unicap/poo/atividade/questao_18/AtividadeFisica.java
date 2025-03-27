package br.unicap.poo.atividade.questao18;

public class AtividadeFisica {
    private String tipoDeAtividade;
    private int duracao;
    private int caloriasQueimadas;

    public AtividadeFisica(String tipoDeAtividade, int duracao) {
        this.tipoDeAtividade = tipoDeAtividade;
        this.duracao = duracao;
        this.caloriasQueimadas = calcularCalorias(duracao);
    }

    private int calcularCalorias(int minutos) {
        return minutos * 5;
    }

    public void alterarTipoDeAtividade(String novoTipo) {
        this.tipoDeAtividade = novoTipo;
    }

    public void exibirAtividade() {
        System.out.println("Atividade: " + tipoDeAtividade + ", Duração: " + duracao +
                " min, Calorias Queimadas: " + caloriasQueimadas);
    }

    public void compararCalorias(AtividadeFisica outraAtividade) {
        if (this.caloriasQueimadas > outraAtividade.caloriasQueimadas) {
            System.out.println(this.tipoDeAtividade + " queimou mais calorias.");
        } else if (this.caloriasQueimadas < outraAtividade.caloriasQueimadas) {
            System.out.println(outraAtividade.tipoDeAtividade + " queimou mais calorias.");
        } else {
            System.out.println("Ambas as atividades queimaram a mesma quantidade de calorias.");
        }
    }
}