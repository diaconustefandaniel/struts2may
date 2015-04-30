package pachet;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import services.ProteinTrackingService;

import com.opensymphony.xwork2.ActionSupport;

import dto.ProteinData;

public class EnterProtein extends ActionSupport  implements SessionAware{

	private int enterProtein;
	private ProteinData proteinData;
	private Map<String, Object> session;
	
	@Override
	public String execute() throws Exception {
		
		if(session.containsKey("proteinData"))
			proteinData=(ProteinData) session.get("proteinData");
			
		if(proteinData!=null)
		{
		ProteinTrackingService proteinTrackingService=new ProteinTrackingService();
		proteinTrackingService.addProteinAmount(enterProtein);
		proteinData.setTotal(proteinData.getTotal()+enterProtein);
		}
		else {
			proteinData=new ProteinData();
			proteinData.setGoal(300);
		}
		
		session.put("proteinData", proteinData);
		
		return SUCCESS;
	}

	public int getEnterProtein() {
		return enterProtein;
	}

	public void setEnterProtein(int enterProtein) {
		this.enterProtein = enterProtein;
	}
	
	public String getGoalText()
	{
		
		return getText("goal.text");
	}

	public ProteinData getProteinData() {
		return proteinData;
	}

	public void setProteinData(ProteinData proteinData) {
		this.proteinData = proteinData;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	
	public void resetTotal(){
		proteinData.setTotal(0);
	}
	
	

}
