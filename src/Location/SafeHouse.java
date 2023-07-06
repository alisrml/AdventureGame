package Location;

import Player.Player;

import java.lang.constant.DynamicCallSiteDesc;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player p) {
        super(p, "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli Evdesiniz...");
        System.out.println("Canınız yenilendi...");
        return true;
    }


}
