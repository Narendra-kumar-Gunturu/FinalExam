/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class FootBall {
    private String playerName;

    public FootBall(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "FootBall{" + "playerName=" + playerName + '}';
    }
    
}
