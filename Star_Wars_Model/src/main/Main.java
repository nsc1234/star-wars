package main;

import enumerations.TieFighter;
import isd.*;

public class Main {

	public static void main(String[] args) {
		
		StarDestroyer ISD1 = new Imperial_I("ISD-001", "Avenger");
		StarDestroyer ISD2 = new Imperial_II("ISD-002", "Devastator");
		
		ISD1.displayShipInfo();
		
		System.out.println();
		System.out.println("<---Adding 20 fighters to each fighter bay--->");
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i = 0; i<20; i++) {
			ISD2.getShpHulls().getSectionFwd().getFighterBay_FWD().getSlots().add(TieFighter.TieFighterS);
			ISD2.getShpHulls().getSectionAft().getFighterBay_PORT().getSlots().add(TieFighter.TieFighterH);
			ISD2.getShpHulls().getSectionAft().getFighterBay_STARBOARD().getSlots().add(TieFighter.TieFighterI);
		}
		
		ISD2.displayShipInfo();
	}

}
