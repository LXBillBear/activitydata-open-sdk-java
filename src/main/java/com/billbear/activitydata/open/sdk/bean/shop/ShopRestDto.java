package com.billbear.activitydata.open.sdk.bean.shop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.lang.Integer;
import java.lang.Double;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ShopRestDto{

 
	
	@JsonProperty("shopId")	
	private String shopId;                 
    
 
	
	@JsonProperty("miles")	
	private Integer miles;                 
    
 
	
	@JsonProperty("shopName")	
	private String shopName;                 
    
 
	
	@JsonProperty("address")	
	private String address;                 
    
 
	
	@JsonProperty("latitude")	
	private Double latitude;                 
    
 
	
	@JsonProperty("longitude")	
	private Double longitude;                 
    
 
	
	@JsonProperty("tel")	
	private String tel;                 
    

 
	
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
    
 
	
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}                
    
 
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
    
 
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}                
    

}