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
            System.out.println("1.Güvenli Ev - Burada düşman yok.");
            System.out.println("2.Eşya Dükkanı - Silah veya Zırh alabilirsiniz.");
            System.out.println("3.Mağara - Ödül:yemek Zombi çıkabilir.");
            System.out.println("4.Orman - Ödül:odun Vampir çıkabilir.");
            System.out.println("5.Nehir - Ödül:su Ayı çıkabilir.");
            System.out.println("0.Oyunu Sonlandır.");
            System.out.print("Gitmek istediğiniz bölge no:");
            int selectLoc = input.nextInt();

            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bölge giriniz...");
            }
            if(location == null){
                System.out.println("Oyun Sonlanıyor...");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Oyun Bitti...");
                break;
            }

        }



    }

}
