import java.util.ArrayList;
import java.util.UUID;

public class Table {
	
	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	public UUID getTableID() {
		return TableID;
	}
	public Table(){
		
	}
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	
	public void AddPlayerToGame(Table t, Player p){
		t.TablePlayers.add(p);
		
	}
	

}
