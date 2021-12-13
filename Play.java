package snakegame;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.util.*;
public class Play{
    public static void main(String[] args) {  
    	Scanner sc = new Scanner(System.in);
    	 Dice dice;
		int diceValue =dice.rollDice();
    	Queue<Player> players = new LinkedList<>();
    	System.out.println("Enter number of dice : ");
    	int no_dice = sc.nextInt();
    	Dice dice1 = new Dice(no_dice);
    	System.out.println("Enter number of players: ");
    	int n = sc.nextInt();
    	sc.nextLine();
    	while(n-- > 0) {
    		System.out.println("Enter player name: ");
    		String name = sc.nextLine();
    		Player p = new Player(name);
    		players.add(p);
    	}
        Snakes snake1 = new Snakes(15,2);
        Snakes snake2 = new Snakes(40,17);
        Snakes snake3 = new Snakes(90,50);
        Snakes snake4 = new Snakes(99,2);
        List<Snakes> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        Ladders ladder1 = new Ladders(5,15);
        Ladders ladder2 = new Ladders(10,27);
        Ladders ladder3 = new Ladders(60,80);
        Ladders ladder4 = new Ladders(3,97);
        List<Ladders> lad = new ArrayList<>();
        lad.add(ladder1);
        lad.add(ladder2);
        lad.add(ladder3);
        lad.add(ladder4);
       Startgame sg=new Startgame(dice1,nt,s,l);
       sg.Startgame();
    }
}
