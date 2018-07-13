package com.billbear.activitydata.open.sdk.response.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.shop.ShopActivityRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetShopsByLocationResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopActivityRestDto> data;                 
    

 

  	
	public List<ShopActivityRestDto> getData() {
		return data;
	}

	public void setData(List<ShopActivityRestDto> data) {
		this.data = data;
	}                
    

}