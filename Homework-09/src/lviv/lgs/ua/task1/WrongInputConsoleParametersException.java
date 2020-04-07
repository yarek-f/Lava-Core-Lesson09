package lviv.lgs.ua.task1;

public class WrongInputConsoleParametersException extends Exception{
	
	private String bug;
	
	public WrongInputConsoleParametersException(String bug) {
		super(bug);
		this.bug = bug;
	}

	public String getBug() {
		return bug;
	}
	
	

}
