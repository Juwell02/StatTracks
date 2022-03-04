public class Team {
	// start the team creation process	
	private String name;

	// includes the players
	private Player player1; 
	private Player player2;
	// assigns players to teams
	public Team(){
		name=null; 
		player1 = new Player(); 
		player2 = new Player();	
	}
	// gets team name
	public String getName() {
		return name;
	}
// 
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

	//keeps track of fouls
	public int getTeamFouls(){
		return player1.getFouls() + player2.getFouls();
	}
	// gets total points
	public int getTeamPoints() {
		return player1.getTotalPoints() + player2.getTotalPoints();
	}

	// prints the player name and number
	public void listPlayers() {
		System.out.println("#1 = " + player1.getPlayerName() + " #" + player1.getPlayerNumber());
		System.out.println("#2 = " + player2.getPlayerName() + " #" + player2.getPlayerNumber());
	}

	// displays the stats of the team
	public void displayStats(){
		System.out.println(name+ " fouls" + "=" + getTeamFouls() +" points = " + getTeamPoints());

	}
}
