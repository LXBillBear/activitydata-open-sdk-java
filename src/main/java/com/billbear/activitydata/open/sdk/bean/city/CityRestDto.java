package com.billbear.activitydata.open.sdk.bean.city;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class CityRestDto{

 
	
	@JsonProperty("cityId")	
	private String cityId;                 
    
 
	
	@JsonProperty("cityName")	
	private String cityName;                 
    

 
	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}                
    
 
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}                
    

}