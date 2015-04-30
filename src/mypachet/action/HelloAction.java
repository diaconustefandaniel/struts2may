package mypachet.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action{

	private String greeting;
	
	@Override
	public String execute() throws Exception {
		setGreeting("Daniel is greeting you!!!");
		return "success";
	}

	
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	

}
