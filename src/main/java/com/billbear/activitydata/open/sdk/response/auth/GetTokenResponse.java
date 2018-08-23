package com.billbear.activitydata.open.sdk.response.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.billbear.activitydata.open.sdk.bean.auth.AuthRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetTokenResponse extends BaseResponse {

    
    @JsonProperty("data")
	private AuthRestDto data;                 
    

 

  	
	public AuthRestDto getData() {
		return data;
	}

	public void setData(AuthRestDto data) {
		this.data = data;
	}                
    

}