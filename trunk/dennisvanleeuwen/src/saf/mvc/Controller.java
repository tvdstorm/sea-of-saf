package saf.mvc;


public abstract class Controller {
	private IView view;
	
	public Controller(IView view){
		this.view = view;
	}
	
	abstract public void run();
	
	protected void renderView(){
		this.view.render();
	}
}