package br.unicap.poo.atividade.questao_07;

public class PerfilUsuario {
    private String nomeUsuario;
    private String bio;
    private int numeroSeguidores;

    public PerfilUsuario() {}

    public PerfilUsuario(String nomeUsuario, String bio, int numeroSeguidores) {
        this.nomeUsuario = nomeUsuario;
        this.bio = bio;
        this.numeroSeguidores = numeroSeguidores;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    public void exibirPerfil() {
        System.out.println("Usuário: " + nomeUsuario + ", Bio: " + bio + ", Seguidores: " + numeroSeguidores);
    }
}
