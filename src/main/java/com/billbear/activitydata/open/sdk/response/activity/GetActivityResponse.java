package com.billbear.activitydata.open.sdk.response.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.billbear.activitydata.open.sdk.bean.activity.ActivityDetailRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetActivityResponse extends BaseResponse {

    
    @JsonProperty("data")
	private ActivityDetailRestDto data;                 
    

 

  	
	public ActivityDetailRestDto getData() {
		return data;
	}

	public void setData(ActivityDetailRestDto data) {
		this.data = data;
	}                
    

}