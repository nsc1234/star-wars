package bay;

import java.util.ArrayList;
import enumerations.TieFighter;

public abstract class FighterBay extends Bay {
	
private ArrayList<TieFighter> slots = new ArrayList<TieFighter>();
	

	public FighterBay(String BayName, String BayID) {
		super(BayName, BayID);
		this.setBayType("Tie Fighter");
	}	
	
	
	public ArrayList<TieFighter> getSlots() {
		return slots;
	}
	
	public void setSlots(ArrayList<TieFighter> slots) {
		this.slots = slots;
	}

}
