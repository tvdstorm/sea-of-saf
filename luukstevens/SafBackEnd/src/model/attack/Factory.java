package model.attack;

public class Factory {
	public static Attack create(String name) {
		if(name.equals("punch_low")) 		return new PunchLow();
		if(name.equals("punch_high")) 		return new PunchHigh();
		if(name.equals("kick_low")) 		return new KickLow();
		if(name.equals("kick_high")) 		return new KickHigh();
		if(name.equals("block_low")) 		return new BlockLow();
		if(name.equals("block_high")) 		return new BlockHigh();
		
		return new BlockHigh();
	}
}
