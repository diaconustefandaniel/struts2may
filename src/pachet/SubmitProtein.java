package pachet;

import com.opensymphony.xwork2.ActionSupport;

public class SubmitProtein extends ActionSupport{

	
	public String execute()
	{
		System.out.println("submited!");
		return "someRedirect";
		//return SUCCESS;
	}
}
