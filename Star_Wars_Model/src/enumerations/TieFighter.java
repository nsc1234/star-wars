package enumerations;

public enum TieFighter {

	TieFighterS("TieFighterS", "Standard"), TieFighterI("TieFighterI", "Interceptor"), TieFighterH("TieFighterB", "Strike");
	
	private String type;
	private String description;

	private TieFighter(final String type, final String description) {
		this.type = type;
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
