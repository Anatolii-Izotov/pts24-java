package sk.uniba.fmph.dcs.player_board;

import sk.uniba.fmph.dcs.player_board.PlayerResourcesAndFood;
import sk.uniba.fmph.dcs.stone_age.Effect;

public interface TribeFedStatus {

    // Methods to enable navigation to PlayerResourcesAndFood
    void setPlayerResourcesAndFood(PlayerResourcesAndFood playerResourcesAndFood);

    PlayerResourcesAndFood getPlayerResourcesAndFood();

    void addField();

    void newTurn();

    boolean feedTribeIfEnoughFood();

    boolean feedTribe(Effect[] resources);

    boolean setTribeFed();

    boolean isTribeFed();

    String state();

    int getFields();
}
