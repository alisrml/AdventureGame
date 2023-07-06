package Location;

import Obstacle.*;
import Player.Player;

public class Cave extends BattleLoc{
    public Cave(Player player) {
        super(player, "Mağara",new Zombie(),"food",3);
    }
}
