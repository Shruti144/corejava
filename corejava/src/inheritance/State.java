package inheritance;

public class State extends Country {
	String stateName;
	long population;
	int noofdistricts;
	
	public State() {
		super();
	}
	
	public State(String continentName, double size, int noofcountries, String countryName, int noofstates,
			String climate,String stateName,long population,int noofdistricts) {
		super(continentName, size, noofcountries, countryName, noofstates, climate);
		this.stateName = stateName;
		this.population = population;
		this.noofdistricts = noofdistricts;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", population=" + population + ", noofdistricts=" + noofdistricts
				+ ", countryName=" + countryName + ", noofstates=" + noofstates + ", climate=" + climate
				+ ", continentName=" + continentName + ", size=" + size + ", noofcountries=" + noofcountries
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}

