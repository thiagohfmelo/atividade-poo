package br.unicap.poo.atividade.questao_07;

public class Main {
    public static void main(String[] args) {
        PerfilUsuario p1 = new PerfilUsuario("lucas_tech", "Desenvolvedor de software", 200);
        PerfilUsuario p2 = new PerfilUsuario("ana_cruz", "Designer gráfico", 350);
        PerfilUsuario p3 = new PerfilUsuario("pedro_fernandes", "Fotógrafo e viajante", 180);

        p1.exibirPerfil();
        p2.exibirPerfil();
        p3.exibirPerfil();
    }
}
