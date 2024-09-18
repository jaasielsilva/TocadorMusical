package javaapplication32;

public class TesteIphone  {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("iPhone 13", "Preto");
    
        System.out.println(iphone);
        iphone.tocarMusica("Shape of You");
        iphone.pausarMusica();
        iphone.fazerChamada("123-456-7890");
        iphone.receberChamada("098-765-4321");
        iphone.navegar("https://www.google.com");
        iphone.fecharAba();
    }
    
}
