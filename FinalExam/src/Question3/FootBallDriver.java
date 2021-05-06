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
public class FootBallDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FootBall football = new FootBallPlayer(100,200,"Narendra");
        //downcasting
        System.out.println("Narendra Kumar Gunturu");
        System.out.println("Solution for Question:3");
        System.out.println(((FootBallPlayer)football).playerStatistics());
        //upcasting
        FootBallPlayer footballPlayer = new FootBallPlayer(50,100,"kumar");
        System.out.println(((FootBall)(footballPlayer)).toString());
    }
    
}
