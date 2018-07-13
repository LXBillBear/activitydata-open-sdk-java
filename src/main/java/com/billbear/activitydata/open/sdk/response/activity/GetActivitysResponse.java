package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivitysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ActivityRestDto> data;                 
    

 

  	
	public List<ActivityRestDto> getData() {
		return data;
	}

	public void setData(List<ActivityRestDto> data) {
		this.data = data;
	}                
    

}