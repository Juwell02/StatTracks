public class Player {
	
	// creates what's needed to create team and score points
private String name; 
private String team;
private int playerNumber;
private double fieldGoal_freeThrow;
private double fieldGoal_2Points;
private double fieldGoal_3Points; 


private double freeThrowAttempts;
private double twoPointAttempts;
private double threePointAttempts;
private int totalPoints;
public int fouls;



// gets users team name

public String getTeam() {return team;}


public void setTeam(String teamName) {this.team = teamName;}


public String getPlayerName() {
	return name; 
}
// recieves and sets the users team names and player names and numbers
public void setName(String name) { this.name = name;}

public int getPlayerNumber() {return playerNumber;}

public void setPlayerNumber (int playerNumber) { this.playerNumber = playerNumber;}


// sets the shot types and attempts and determines what they are worth
public void shotAttempt (int shotType, boolean made) {
	switch(shotType) {
	
	case 1: 
		freeThrowAttempts++;
		fieldGoal_freeThrow += made ? 1 : 0;
		if(made) {
			totalPoints = totalPoints +1;
		}
		break;
		
	case 2:
			twoPointAttempts++;
			fieldGoal_2Points += made ? 1 : 0;
			if(made) {
				totalPoints = totalPoints +2;
				}
			break;
	
	case 3: threePointAttempts++;
			fieldGoal_3Points += made ? 1 : 0;
	if(made) {
		totalPoints = totalPoints +3;
		}
	break;
	
	default:
		System.out.println("Invalid Shot type " +shotType);
		
	}
}

public double getOnePoint() {
	return fieldGoal_freeThrow; 
}

public double getTwoPointer() {
	return fieldGoal_2Points;
}

public double getThreePointer() {
	return fieldGoal_3Points;
}	

// prints when players scores and add the points scored to their score
public void displayStats(){
	
	System.out.println("#" + playerNumber + " " + name + " Fouls = " + fouls + " points = " + totalPoints);
	System.out.println(" 	Attempts				Made			Percentage");	
if(fieldGoal_freeThrow == 0) {
		System.out.println("Free Throws" + "				" + freeThrowAttempts +"			" + fieldGoal_freeThrow + "		" + "0");
			}
else System.out.printf("Free Throws" + "		" + freeThrowAttempts + "					" + fieldGoal_freeThrow +" 			%2f\n", (fieldGoal_freeThrow/freeThrowAttempts)* 100.0); 	
		

if (fieldGoal_2Points ==0) {
	System.out.println("2 point field goal" + "		" + twoPointAttempts + "				" + fieldGoal_2Points + "					" +"0");
}
else System.out.printf("2 point field goals" +"	"+ twoPointAttempts +"				" + fieldGoal_2Points +"					%2f\n", (fieldGoal_2Points/twoPointAttempts) * 100.0);
	
	
if(fieldGoal_3Points == 0) {
	System.out.println("3 point field goal" +" 		"+ threePointAttempts + "			 " + fieldGoal_3Points +"					"+"0");
}
else System.out.printf("3 point field goal" + "		"+ threePointAttempts +"			" + fieldGoal_3Points +"					%2f\n", (fieldGoal_3Points/threePointAttempts)* 100.0);	
		
}


// keeps track of all fouls and points
public int getFouls() {
	return fouls;
	
	
	}
public void setFouls(int fouls) {
	this.fouls = fouls;
}

public String getTeamName() {
	return team;
}
public int getTotalPoints() {
	return totalPoints;
}


}
