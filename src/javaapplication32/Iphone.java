package javaapplication32;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;

    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void fecharAba() {
        System.out.println("Aba fechada.");
    }

    // Métodos adicionais da classe Iphone
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Iphone [modelo=" + modelo + ", cor=" + cor + "]";
    }
}
