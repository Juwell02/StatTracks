public class Team {
	
private String name;

private Player player1;
	private Player player2;
	
	public Team(){
		name=null;
		player1 = new Player();
		player2 = new Player();	
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
		
	}
	
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public int getTeamFouls(){
		return player1.getFouls() + player2.getFouls();
	}
	public int getTeamPoints() {
		return player1.getTotalPoints() + player2.getTotalPoints();
	}
	public void listPlayers() {
		System.out.println("#1 = " + player1.getPlayerName() + " #" + player1.getPlayerNumber());
		System.out.println("#2 = " + player2.getPlayerName() + " #" + player2.getPlayerNumber());
	}
	public void displayStats(){
		System.out.println(name+ " fouls" + "=" + getTeamFouls() +" points = " + getTeamPoints());
	
	}
}
