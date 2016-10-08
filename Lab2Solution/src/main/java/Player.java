import java.util.UUID;

public class Player {
	
	private UUID PlayerID;
	private String Playername;
	private int PlayerPosition;
	
	public Player(){
		
	}

	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

	public String getPlayername() {
		return Playername;
	}

	public void setPlayername(String playername) {
		Playername = playername;
	}

	public int getPlayerPosition() {
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}
	
	
	

}
