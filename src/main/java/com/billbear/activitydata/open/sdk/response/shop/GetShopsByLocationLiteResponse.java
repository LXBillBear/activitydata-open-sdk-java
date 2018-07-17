package com.billbear.activitydata.open.sdk.response.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.shop.ShopActivityLiteRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetShopsByLocationLiteResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopActivityLiteRestDto> data;                 
    

 

  	
	public List<ShopActivityLiteRestDto> getData() {
		return data;
	}

	public void setData(List<ShopActivityLiteRestDto> data) {
		this.data = data;
	}                
    

}