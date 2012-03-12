package alert;

public abstract class Alert {
	private final String alertText;
	
	public Alert(String alert) {
		this.alertText = alert;
	}
	public String getAlert() {
		return alertText;
	}
}
