package Location;

import Obstacle.*;
import Player.Player;

public class Forest extends BattleLoc{
    public Forest(Player player) {
            super(player, "Orman",new Vampire(),"firewood",3);
    }
}
