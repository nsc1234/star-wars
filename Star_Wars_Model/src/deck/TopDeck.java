package deck;

import java.util.ArrayList;

import operation.Specs_Imperial;
import armament.LaserCannon;

public class TopDeck extends ShipDeck implements Specs_Imperial {
	
	private ArrayList<LaserCannon> cannonBattery = new ArrayList<>();

	public TopDeck(String StarDestroyerType) {
		super("Top Deck", StarDestroyerType, deckSpecs_I[1], deckSpecs_I[4], deckSpecs_I[7], deckSpecs_I[10]);
		if(StarDestroyerType == "Imperial_I") {
			this.setLength(deckSpecs_I[1]);
			this.setHeight(deckSpecs_I[4]);
			this.setWidth(deckSpecs_I[7]);
			this.setWeight(deckSpecs_I[10]);
		}
		else {
			this.setLength(deckSpecs_II[1]);
			this.setHeight(deckSpecs_II[4]);
			this.setWidth(deckSpecs_II[7]);
			this.setWeight(deckSpecs_II[10]);
		}
		
		for(int i=0; i<10; i++) {
			this.cannonBattery.add(new LaserCannon());
		}
	}

	public ArrayList<LaserCannon> getCannonBattery() {
		return cannonBattery;
	}

	public void setCannonBattery(ArrayList<LaserCannon> cannonBattery) {
		this.cannonBattery = cannonBattery;
	}

}
