package com.billbear.activitydata.open.sdk.bean.activity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;
import java.util.Date;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class ActivityDetailRestDto{

 
	
	@JsonProperty("id")	
	private String id;                 
    
 
	
	@JsonProperty("title")	
	private String title;                 
    
 
	
	@JsonProperty("bigImgUrl")	
	private String bigImgUrl;                 
    
 
	
	@JsonProperty("bankName")	
	private String bankName;                 
    
 
	
	@JsonProperty("availableTime")	
	private String availableTime;                 
    
 
	
	@JsonProperty("availableCity")	
	private String availableCity;                 
    
 
	
	@JsonProperty("content")	
	private String content;                 
    
 
	
	@JsonProperty("category")	
	private String category;                 
    
 
	
	@JsonProperty("subjectDescription")	
	private String subjectDescription;                 
    
 
	
	@JsonProperty("way")	
	private String way;                 
    
 
	
	@JsonProperty("note")	
	private String note;                 
    
 
	@com.fasterxml.jackson.annotation.JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@JsonProperty("endDate")	
	private Date endDate;                 
    

 
	
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
    
 
	
	public String getBigImgUrl() {
		return bigImgUrl;
	}

	public void setBigImgUrl(String bigImgUrl) {
		this.bigImgUrl = bigImgUrl;
	}                
    
 
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}                
    
 
	
	public String getAvailableTime() {
		return availableTime;
	}

	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}                
    
 
	
	public String getAvailableCity() {
		return availableCity;
	}

	public void setAvailableCity(String availableCity) {
		this.availableCity = availableCity;
	}                
    
 
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}                
    
 
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}                
    
 
	
	public String getSubjectDescription() {
		return subjectDescription;
	}

	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}                
    
 
	
	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}                
    
 
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}                
    
 
	
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}                
    

}