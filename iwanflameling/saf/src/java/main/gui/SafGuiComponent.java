package gui;

import java.util.List;

public abstract class SafGuiComponent implements UpdatableGui {
	
	List<UpdatableGui> guiChildren;

	@Override
	public void update() {
		if(guiChildren != null){
			for(UpdatableGui child : guiChildren){
				child.update();
			}
		}
		
	}

	
}
