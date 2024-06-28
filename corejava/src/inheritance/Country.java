package inheritance;

public class Country extends Contient
{
		 String countryName;
		 int noofstates;
		 String climate;
		 
		 public Country() {
			 super();
		 }

		public Country(String continentName, double size,int noofcountries, String countryName,int noofstates,String climate) {
			super(continentName, size, noofcountries);
			this.countryName = countryName;
			this.noofstates = noofstates;
			this.climate = climate;
		}

		@Override
		public String toString() {
			return "Country [countryName=" + countryName + ", noofstates=" + noofstates + ", climate=" + climate
					+ ", continentName=" + continentName + ", size=" + size + ", noofcountries=" + noofcountries
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
		
		
	}

