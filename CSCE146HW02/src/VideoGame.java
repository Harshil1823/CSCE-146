/*
 * Harshil Shah
 */
public class VideoGame {

	private String gameName;
    private String console;
    
    public VideoGame(){
        this.gameName="no name yet";
        this.console="no console yet";
    }

    public VideoGame(String name, String console) {
        setName(name);
        setConsole(console);
    }
    
    public String getName() {
        return gameName;
    }
    
    public String getConsole() {
        return console;
    }

    public void setName(String name) {
        this.gameName = name;
    }

    public void setConsole(String console) {
        this.console = console;
    }
    
    public String toString(){
        return this.gameName +"\t"+this.console;
    }
	
	
	
}//class
