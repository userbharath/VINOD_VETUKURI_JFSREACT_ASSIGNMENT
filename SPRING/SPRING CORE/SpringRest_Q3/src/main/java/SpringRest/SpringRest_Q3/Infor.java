package SpringRest.SpringRest_Q3;

public class Infor {

	private String state;
	private String city;
	private String country;
	private String zipcode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Infor(String state, String city, String country, String zipcode) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}
	public Infor() {
		super();
	}
	
	
}
