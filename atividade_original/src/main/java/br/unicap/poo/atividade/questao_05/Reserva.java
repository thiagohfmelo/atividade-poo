package br.unicap.poo.atividade.questao_05;

public class Reserva {
    private String nomeHospede;
    private String tipoQuarto;
    private int numeroNoites;

    public Reserva() {}

    public Reserva(String nomeHospede, String tipoQuarto, int numeroNoites) {
        this.nomeHospede = nomeHospede;
        this.tipoQuarto = tipoQuarto;
        this.numeroNoites = numeroNoites;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    public void setNumeroNoites(int numeroNoites) {
        this.numeroNoites = numeroNoites;
    }

    public void exibirReserva() {
        System.out.println("Hóspede: " + nomeHospede + ", Tipo de Quarto: " + tipoQuarto + ", Noites: " + numeroNoites);
    }
}
