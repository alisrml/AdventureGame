package Location;

import Items.Weapon;
import Player.Player;

public class ToolStore extends NormalLoc{
    public ToolStore(Player p) {
        super(p, "Mağaza");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Mağazaya Hoşgeldiniz...");
        System.out.println("1 Silahlar");
        System.out.println("2 Zırhlar");
        System.out.println("3 Çıkış yap");
        System.out.print("Seçiminiz:");
        int selectCase = input.nextInt();
        while (selectCase<1 || selectCase>3){
            System.out.print("Geçersiz değer tekrar giriniz:");
            selectCase = input.nextInt();
        }
        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("Yine bekleriz...");
                return true;
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("Items");
        for(Weapon w: Weapon.weapons()){
            System.out.println(w.getId()+"-"+w.getName()+" Para: "+w.getPrice()+" Hasar: "+w.getDamage());
        }
    }

    public void buyWeapon(){
        System.out.print("Silah seçiniz: ");
        int selectWeaponID = input.nextInt();

        while (selectWeaponID<1 || selectWeaponID>Weapon.weapons().length){
            System.out.print("Geçersiz değer tekrar giriniz:");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        if(selectedWeapon!= null){
            if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Yeterli paranız bulunmamaktadır...");
            }else {
                //Satın almanın gerçekleştiği alan.
                System.out.println(selectedWeapon.getName()+"silahını satın aldınız...");
                int balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız: "+this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Yeni silahınız: "+this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }
    public void printArmor(){
        System.out.println("Zırhlar");
    }
}
