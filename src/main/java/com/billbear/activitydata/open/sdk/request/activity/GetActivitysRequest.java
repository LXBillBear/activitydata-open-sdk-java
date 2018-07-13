package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.String;
import java.lang.Double;
import java.lang.Long;
import com.billbear.activitydata.open.sdk.response.activity.GetActivitysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivitysRequest extends BaseRequest<GetActivitysResponse> {

 
	private String cityId;                 
    
 
	private Double latitude;                 
    
 
	private Double longitude;                 
    
 
	private Long id;                 
    

 

  	
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
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
    
 

  	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "activity/getActivitys";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("city_id", this.getCityId());
	    map.put("latitude", this.getLatitude());
	    map.put("longitude", this.getLongitude());
	    map.put("id", this.getId());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetActivitysResponse> getResponseClass() {
		return GetActivitysResponse.class;
	}

}	