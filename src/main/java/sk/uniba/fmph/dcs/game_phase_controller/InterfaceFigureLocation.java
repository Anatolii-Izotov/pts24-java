package sk.uniba.fmph.dcs.game_phase_controller;

import sk.uniba.fmph.dcs.stone_age.ActionResult;
import sk.uniba.fmph.dcs.stone_age.Effect;
import sk.uniba.fmph.dcs.stone_age.HasAction;
import sk.uniba.fmph.dcs.stone_age.PlayerOrder;

import java.util.Collection;

public interface InterfaceFigureLocation {

    boolean placeFigures(PlayerOrder player, int figureCount);

    HasAction tryToPlaceFigures(PlayerOrder player, int count);

    ActionResult makeAction(PlayerOrder player, Collection<Effect> inputResources, Collection<Effect> outputResources);

    boolean skipAction(PlayerOrder player);

    HasAction tryToMakeAction(PlayerOrder player);

    boolean newTurn(); // Returns true if the end of the game is implied by the given location
}