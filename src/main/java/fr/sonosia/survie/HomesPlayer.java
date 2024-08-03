package fr.sonosia.survie;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

@Getter
@Setter
public class HomesPlayer {

    private Player player;
    private int homesLimit;
    private boolean admin;

    public HomesPlayer(Player player, int homesLimit, boolean admin) {
        this.player = player;
        this.homesLimit = homesLimit;
        this.admin = admin;
    }

}
