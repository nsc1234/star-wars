package engine;

public class Engine {
	
	private String IDNumber;
	private ShipEngine[] Engines = new ShipEngine[3];
	
	public Engine(String IDNumber, String StarDestroyerType) {
		this.IDNumber = IDNumber;
		this.Engines[0] = new Engine_S(StarDestroyerType);
		this.Engines[1] = new Engine_C(StarDestroyerType);
		this.Engines[2] = new Engine_S(StarDestroyerType);
		
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return Engines;
	}

	public void setEngines(ShipEngine[] engines) {
		Engines = engines;
	}
	


}
