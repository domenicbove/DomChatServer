import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Group {

	private ConcurrentLinkedQueue<PrintStream> membersStream;
	private ArrayList<String> playlist;
	private String currentSongId;
	private int startTime;
	private ArrayList<User> users;
	
	public Group(){
		membersStream = new ConcurrentLinkedQueue<PrintStream>();
		users = new ArrayList<User>();
		setPlaylist(new ArrayList<String>());
	}

	public void add(PrintStream outStream) {
		membersStream.add(outStream);
	}
	
	public ConcurrentLinkedQueue<PrintStream> getMembersStream(){
		return membersStream;
	}

	public String getCurrentSongId() {
		return currentSongId;
	}

	public void setCurrentSongId(String currentSongId) {
		this.currentSongId = currentSongId;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public void addUser(User u) {
		users.add(u);
		membersStream.add(u.getPrintStream());
	}



	public ArrayList<String> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<String> playlist) {
		this.playlist = playlist;
	}
}
