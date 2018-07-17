package com.billbear.activitydata.open.sdk.request.shop;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.Double;
import java.lang.Long;
import com.billbear.activitydata.open.sdk.response.shop.GetShopsByLocationLiteResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetShopsByLocationLiteRequest extends BaseRequest<GetShopsByLocationLiteResponse> {

 
	private Double latitude;                 
    
 
	private Double longitude;                 
    
 
	private Long id;                 
    

 

  	
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
		return "shopLite/getShopsByLocationLite";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("latitude", this.getLatitude());
	    map.put("longitude", this.getLongitude());
	    map.put("id", this.getId());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetShopsByLocationLiteResponse> getResponseClass() {
		return GetShopsByLocationLiteResponse.class;
	}

}	