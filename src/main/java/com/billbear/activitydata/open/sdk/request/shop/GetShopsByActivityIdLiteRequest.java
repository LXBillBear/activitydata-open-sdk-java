package com.billbear.activitydata.open.sdk.request.shop;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Double;
import java.lang.String;
import java.lang.Integer;
import com.billbear.activitydata.open.sdk.response.shop.GetShopsByActivityIdLiteResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetShopsByActivityIdLiteRequest extends BaseRequest<GetShopsByActivityIdLiteResponse> {

 
	private Double latitude;                 
    
 
	private Double longitude;                 
    
 
	private String cityId;                 
    
 
	private String activityId;                 
    
 
	private Integer pageNo;                 
    
 
	private Integer pageSize;                 
    

 

  	
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
    
 

  	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}                
    
 

  	
	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}                
    
 

  	
	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}                
    
 

  	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "shopLite/getShopsByActivityIdLite";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("latitude", this.getLatitude());
	    map.put("longitude", this.getLongitude());
	    map.put("city_id", this.getCityId());
	    map.put("activity_id", this.getActivityId());
	    map.put("page_no", this.getPageNo());
	    map.put("page_size", this.getPageSize());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetShopsByActivityIdLiteResponse> getResponseClass() {
		return GetShopsByActivityIdLiteResponse.class;
	}

}	