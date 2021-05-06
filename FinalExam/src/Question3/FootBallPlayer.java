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
public class FootBallPlayer extends FootBall {
    private int goalsScored;
    private int matchesPlayed;

    public FootBallPlayer(int goalsScored, int matchesPlayed, String playerName) {
        super(playerName);
        this.goalsScored = goalsScored;
        this.matchesPlayed = matchesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    
    public String playerStatistics(){
        return "The player "+super.getPlayerName()+" has scored "+goalsScored +" goals in "+matchesPlayed +" played";
    }
}
