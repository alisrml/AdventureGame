import Location.Location;
import Player.Player;
import Location.*;
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
        Location location = null;

        while (true){
            System.out.println();
            player.printInfo();
            System.out.println("Bölgeler");
            System.out.println("1.Güvenli Ev");
            System.out.println("2.Mağaza");
            System.out.println("3.");
            System.out.print("Gitmek istediğiniz bölge no:");
            int selectLoc = input.nextInt();

            switch (selectLoc){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(!location.onLocation()){
                System.out.println("Oyun Bitti...");
                break;
            }

        }



    }

}
