package com.billbear.activitydata.open.sdk.response.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.shop.ShopRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetShopsByActivityIdResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopRestDto> data;                 
    

 

  	
	public List<ShopRestDto> getData() {
		return data;
	}

	public void setData(List<ShopRestDto> data) {
		this.data = data;
	}                
    

}