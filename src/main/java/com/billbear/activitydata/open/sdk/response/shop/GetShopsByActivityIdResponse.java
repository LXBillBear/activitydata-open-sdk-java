package com.billbear.activitydata.open.sdk.response.shop;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.billbear.activitydata.open.sdk.bean.shop.ShopLiteRestDto;
import com.billbear.activitydata.open.sdk.response.BaseResponse;

public class GetShopsByActivityIdResponse extends BaseResponse {

    
    @JsonProperty("data")
	private List<ShopLiteRestDto> data;                 
    

 

  	
	public List<ShopLiteRestDto> getData() {
		return data;
	}

	public void setData(List<ShopLiteRestDto> data) {
		this.data = data;
	}                
    

}