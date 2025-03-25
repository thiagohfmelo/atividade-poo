package br.unicap.poo.atividade.questao_06;

public class Veiculo {
    private String placa;
    private String marca;
    private int ano;

    public Veiculo() {}

    public Veiculo(String placa, String marca, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirVeiculo() {
        System.out.println("Placa: " + placa + ", Marca: " + marca + ", Ano: " + ano);
    }
}
