package mn223dn_assign4.sort_cities;


public class City implements Comparable<City> {
	private int zip ;
	private String name;
	
	public City(int inZip, String inName) {
		zip = inZip;
		name = inName;
	}
	
	public void setZip(int inZip){
		zip = inZip;
	}
	
	public void setName (String inName){
		name = inName;
	}
	
	public int getZip(){
		return zip;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return  zip+" "+name ;
	}
	
	public int compareTo(City a){
		if (a.getZip() > zip )
			return 1;
		return 0; 
	}

}
