package com.billbear.activitydata.open.sdk.bean.shop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.bean.shop.ActivityLiteRestDto;
import java.util.List;
import java.lang.Double;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ShopActivityRestDto{

 
	
	@JsonProperty("shopId")	
	private String shopId;                 
    
 
	
	@JsonProperty("miles")	
	private Integer miles;                 
    
 
	
	@JsonProperty("acts")	
	private List<ActivityLiteRestDto> acts;                 
    
 
	
	@JsonProperty("shopName")	
	private String shopName;                 
    
 
	
	@JsonProperty("logoSmall")	
	private String logoSmall;                 
    
 
	
	@JsonProperty("latitude")	
	private Double latitude;                 
    
 
	
	@JsonProperty("longitude")	
	private Double longitude;                 
    

 
	
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}                
    
 
	
	public Integer getMiles() {
		return miles;
	}

	public void setMiles(Integer miles) {
		this.miles = miles;
	}                
    
 
	
	public List<ActivityLiteRestDto> getActs() {
		return acts;
	}

	public void setActs(List<ActivityLiteRestDto> acts) {
		this.acts = acts;
	}                
    
 
	
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}                
    
 
	
	public String getLogoSmall() {
		return logoSmall;
	}

	public void setLogoSmall(String logoSmall) {
		this.logoSmall = logoSmall;
	}                
    
 
	
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}                
    
 
	
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}                
    

}