package com.billbear.activitydata.open.sdk.bean.shop;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityLiteRestDto{

 
	
	@JsonProperty("id")	
	private String id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("bankName")	
	private String bankName;                 
    
 
	
	@JsonProperty("category")	
	private String category;                 
    
 
	
	@JsonProperty("bigImgUrl")	
	private String bigImgUrl;                 
    
 
	
	@JsonProperty("availableTime")	
	private String availableTime;                 
    

 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}                
    
 
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}                
    
 
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}                
    
 
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}                
    
 
	
	public String getBigImgUrl() {
		return bigImgUrl;
	}

	public void setBigImgUrl(String bigImgUrl) {
		this.bigImgUrl = bigImgUrl;
	}                
    
 
	
	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}                
    

}