package pachet;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action{

	private String welcome;
	
	@Override
	public String execute() throws Exception {
		setWelcome("Welcome friend!!!");
		return "success";
	}

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	

	
	

}
