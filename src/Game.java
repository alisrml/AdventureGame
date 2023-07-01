import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz...");
        System.out.println("Lütfen isim giriniz:");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println(player.getName()+" macera oyununa hoşgeldiniz...");
        System.out.println("Lütfen karakter seçiniz...");
        player.selectChar();


    }

}
