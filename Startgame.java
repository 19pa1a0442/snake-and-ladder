package snakegame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Startgame{
	
    private Queue<Player>nt ;
    private List<Snakes> s;
    private List<Ladders> l;
    private int dice;
   // Map<Integer,String> presentposition;
    int boardsize =100;
    Startgame(int dice,Queue<Player> nt,List<Snakes> s,List<Ladders> l){
    this.dice=dice;
    this.nt = nt;
    this.s= s;
    this.l =l;
    //this.presentposition = presentposition;
}
void StartGame(){
    while (nt.size()>1){
        Player pl = nt.poll();
        Dice dice1;
		int diceValue = dice1.rollDice();
		  int currentPosition = pl.getLocation();
      // int currentPosition = presentposition.get(pl.getPlayerName());
        int nextCell = currentPosition + diceValue;
        if(nextCell > boardsize){
            nt.offer(pl);
        } 
        else if(nextCell == boardsize){
            System.out.println(pl.getPlayerName()+" "+"won");
        }
        else{
            int[] nextPosition = new int[1];
            boolean[] b = new boolean[1];
            nextPosition[0] = nextCell;
        }
        Snakes.forEach(v->{
        if(v.startpoint == nextCell){
            nextCell = v.endpoint;
        }})
        int[] nextPosition;
		if(nextPosition[0] != nextCell ){
            System.out.println(pl.getPlayerName()+"is bittrn by snake at"+ nextCell);
        }
        Ladders.forEach(v-> {
            if(v.startpoint == nextCell){
                nextCell = v.endpoint;
                b[0] = true;
            }})
            if(nextPosition[0] != nextCell && b[0] ){
                System.out.println(pl.getPlayerName()+"climbed ladder present at"+ nextCell);
            }
            if(nextCell == boardsize){
                System.out.println(pl.getPlayerName()+"won the game");
            }
            else{
                currentPosition.put(pl.getPlayerName(),nextPosition[0]);
                System.out.println(pl.getPlayerName() + " is at position "+ nextPosition[0]);
                nt.offer(pl);
            }
        }
    }
}
