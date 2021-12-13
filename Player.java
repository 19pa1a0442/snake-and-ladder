package snakegame;
class Player{
    private String playerName;
    private int id; 
    private int location = 0;
Player(String playerName){
    this.playerName =playerName;
    
}
String getPlayerName() {
	return playerName;
}
public int getId(){
    return id;
}
public int getLocation() {
	return location;
}
public void setLocation(int loc) {
	location = loc;
}

}
