package com.billbear.activitydata.open.sdk.request.city;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.city.GetCitysResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetCitysRequest extends BaseRequest<GetCitysResponse> {


	
	@Override
	public String getApiMethod() {
		return "city/getCitys";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetCitysResponse> getResponseClass() {
		return GetCitysResponse.class;
	}

}	