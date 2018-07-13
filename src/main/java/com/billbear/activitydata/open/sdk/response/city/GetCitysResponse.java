package com.billbear.activitydata.open.sdk.response.city;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.city.CityRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetCitysResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<CityRestDto> data;                 
    

 

  	
	public List<CityRestDto> getData() {
		return data;
	}

	public void setData(List<CityRestDto> data) {
		this.data = data;
	}                
    

}