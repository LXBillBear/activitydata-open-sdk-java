package com.billbear.activitydata.open.sdk.request.shop;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Double;
import java.lang.String;
import java.util.Date;
import com.billbear.activitydata.open.sdk.response.shop.GetShopsByLocationLiteResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetShopsByLocationLiteRequest extends BaseRequest<GetShopsByLocationLiteResponse> {

 
	private Double latitude;                 
    
 
	private Double longitude;                 
    
 
	private String bankName;                 
    
 
	private String category;                 
    
 
	private Date date;                 
    

 

  	
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
    
 

  	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "shopLite/getShopsByLocationLite";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("latitude", this.getLatitude());
	    map.put("longitude", this.getLongitude());
	    map.put("bank_name", this.getBankName());
	    map.put("category", this.getCategory());
	    map.put("date", this.getDate());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetShopsByLocationLiteResponse> getResponseClass() {
		return GetShopsByLocationLiteResponse.class;
	}

}	