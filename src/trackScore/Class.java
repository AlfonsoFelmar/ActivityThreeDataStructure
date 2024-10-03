
package trackScore;

import java.util.ArrayList;
import java.util.Scanner;

public class Class {
    int score;
    public void inputScores() {
        Scanner scn = new Scanner(System.in);

       
         
        ArrayList<Integer> players = new ArrayList<Integer>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Number of player: ");
        int n = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            players.add(i); 
            
        }
        
        for(int player: players){
            System.out.println("\nInput score for player " + player);
            scores.add(scn.nextInt());
                    
        }
        
        for (int i = 0; i < players.size(); i++) {
            int player = players.get(i);
            score = scores.get(i);{
            
                System.out.println("Player " + player + " Score: " + score);
            
        }
        
        

        

    }
    }
}
