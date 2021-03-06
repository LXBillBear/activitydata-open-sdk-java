package com.billbear.activitydata.open.sdk.bean.shop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.lang.Integer;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ShopLiteRestDto{

 
	
	@JsonProperty("shopId")	
	private String shopId;                 
    
 
	
	@JsonProperty("miles")	
	private Integer miles;                 
    
 
	
	@JsonProperty("shopName")	
	private String shopName;                 
    
 
	
	@JsonProperty("address")	
	private String address;                 
    
 
	
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
    
 
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}                
    

}