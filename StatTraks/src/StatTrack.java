
/** Justin Wells
*Stat Track App
* 2/28/20202
*/



public class StatTrack {
 


private Team team1;
// team 1

private Team team2;
// team 2

  private final static String doubleLine = " ========================================";
  // prints double line
  
  private final static String singleLine = "------------------------------------------";
  // prints single line
  
  // constructor for both teams
 private StatTrack() {
	 
	 team1 = new Team();
	 team2 = new Team();
 }
 
 
 //displays the app header
 private void displayAppHeading() {
	  
	 System.out.println(doubleLine);
	 System.out.println("Welcome to the Basketball Stats App");
	 System.out.println(doubleLine);
	 System.out.println();
 }
 
 // starts the setting up the teams with the team names
 private void teamSetUp() {
	 
	 String userInput = null;
	 
	 userInput = Input.getLine("Enter the #1 Team Name:  ");
	team1.setName(userInput);
	 playersSetup(team1);
	 System.out.println();
	 System.out.println(singleLine); 
	 System.out.println();
	 userInput = Input.getLine( "Enter the #2 Team Name");
	team2.setName(userInput);
	 playersSetup(team2);   

 }
 
 // starts setting the players up
 private void playersSetup(Team team) {
	 String teamName = team.getName();
	 String name = null;
	 int number = 0;
	 
	 System.out.println();
	 name = Input.getLine( "Enter " + teamName + "'s #1 player's name: ");
	 number = Input.getIntRange( "Enter " + name + " jersey number:", 0, 99 );
	 
	 Player player1 = new Player();
	 player1.setName(name);
	 player1.setPlayerNumber(number);
	 
	  
	 team.setPlayer1(player1);
	 System.out.println();
	
	name = Input.getLine( "Enter " + teamName + "'s #2 player's name:" );
	 number = Input.getIntRange( "Enter " + name + " jersey number: ", 0, 99);
	 
	 Player player2 = new Player();
	 player2.setName(name);
	 player2.setPlayerNumber(number);
	 team.setPlayer2(player2);
	 
 }
 // continues running the game
 
 private void playGame() {
	 boolean playGame = true;
	 int userInput = 0;
	 
	 System.out.println();
	 System.out.println(doubleLine);
	 System.out.println ("Game Started ");
	 System.out.println (doubleLine);
	 System.out.println();
	 
	 while (playGame) { 
	 
	 System.out.println(singleLine);
	 System.out.println("Main Menu");
	 System.out.println(singleLine);
	 
	 System.out.println("0 = End Game");
	 System.out.println("1 = Enter " + team1.getName() + " Team's Stats");
	 System.out.println("2 = Enter " + team2.getName() + " Team's Stats");
	 System.out.println("3 = Display Game Stats");
	 
	 
	 System.out.println(singleLine);
	 userInput = Input.getIntRange( "Menu Choice: ", 0, 3);
	 System.out.println(singleLine);
	 
	System.out.println();
	
	switch (userInput) {
	case 0:
	playGame = false;
	updateScoreboard();
	System.out.println();
	break;
	
	case 1: 
	updateTeamStats(team1);
	System.out.println();
	updateScoreboard();
	System.out.println();
	break;
	
	case 2:
	updateTeamStats(team2);
	System.out.println();
	updateScoreboard();
	System.out.println();
	break;
	 
	case 3:
		dispayGameStatus();
	break;
	
	default: 
		System.out.println("Invalid menu choice = " + userInput);
		
		}
	 }
 }
	
 
 // updates the players stats 
	private void updateTeamStats(Team team) {
		int playerNum = 0;
		
		System.out.println(singleLine);
		System.out.println("Select Player");
		System.out.println(singleLine);
		team.listPlayers();
		System.out.println(singleLine);
		playerNum = Input.getIntRange( "Enter Player: ", 1, 2);
		System.out.println(singleLine);
		if(playerNum == 0)
			updatePlayerStats(team.getPlayer1());
		else 
			updatePlayerStats(team.getPlayer2());
		System.out.println();
		}
	// updates team stats
	private void updatePlayerStats(Player player) {
		int type = 0;
		int made = 0;
		
	System.out.println();
	System.out.println(singleLine);
	System.out.println("Select Stat Type");
	System.out.println(singleLine);
	System.out.println("0 = foul");
	System.out.println("1 = free throw");
	System.out.println("2 = 2 points");
	System.out.println("3 = 3 points");
	System.out.println(singleLine);
	type = Input.getIntRange( "Enter Stat Type: ", 0, 3);
	System.out.println(singleLine);
	System.out.println();
		
	// determines shots made, fouls, and points scored.
	if ( type == 0) {
		player.setFouls(player.getFouls()+1);
		} else {
			System.out.println(singleLine);
			System.out.println("Select Attempt");
			System.out.println(singleLine);
			System.out.println("#0 = Missed Shot");
			System.out.println("#1 = Made Shot");
			System.out.println(singleLine);
			made = Input.getIntRange( "Enter Attempt: ",0, 1);
			System.out.println(singleLine);
			
			if(made == 0)
		player.shotAttempt(type, false);
			else
				player.shotAttempt(type,  true);
			System.out.println();
			
			}
		
	}
	
	// updates the scoreboard
	private void updateScoreboard() {
		
		team1.displayStats();
		team2.displayStats();
		
	}
	// shows all stats
	private void dispayGameStatus() {
		team1.getPlayer1().displayStats();
		System.out.println();
		
		team1.getPlayer2().displayStats();
		System.out.println();
		
		team2.getPlayer1().displayStats();
		System.out.println();
		
		team2.getPlayer2().displayStats();
		System.out.println();
		
	}
	// end of game
	
	
	// main method that creates the app 
	
	// args no command line input used 
	public static void main(String[] args) {
		StatTrack app = new StatTrack();
		app.displayAppHeading();
		app.teamSetUp();
		app.playGame();
		Input.sc.close();
		
	}
	
	 }
    


