package com.billbear.activitydata.open.sdk.request.activity;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import com.billbear.activitydata.open.sdk.util.JsonUtil;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import java.lang.String;
import com.billbear.activitydata.open.sdk.response.activity.GetActivityResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetActivityRequest extends BaseRequest<GetActivityResponse> {

 
	private String id;                 
    

 

  	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}                
    
	
	@Override
	public String getApiMethod() {
		return "activity/getActivity";
	}


	@Override
	public String getAppParams() throws IOException {
		Map<String, Object> map = new TreeMap<String,Object>();
	    map.put("id", this.getId());
	    return JsonUtil.toJson(map);
	}

	@Override
	public Class<GetActivityResponse> getResponseClass() {
		return GetActivityResponse.class;
	}

}	