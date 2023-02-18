package dataEntity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZipResponse {

	@JsonProperty("country")
	private String country;

	@JsonProperty("places")
	private List<PlacesItem> places;

	@JsonProperty("country abbreviation")
	private String countryAbbreviation;

	@JsonProperty("post code")
	private String postCode;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setPlaces(List<PlacesItem> places){
		this.places = places;
	}

	public List<PlacesItem> getPlaces(){
		return places;
	}

	public void setCountryAbbreviation(String countryAbbreviation){
		this.countryAbbreviation = countryAbbreviation;
	}

	public String getCountryAbbreviation(){
		return countryAbbreviation;
	}

	public void setPostCode(String postCode){
		this.postCode = postCode;
	}

	public String getPostCode(){
		return postCode;
	}
}