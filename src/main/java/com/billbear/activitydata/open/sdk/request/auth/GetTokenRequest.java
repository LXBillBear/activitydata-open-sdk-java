package com.billbear.activitydata.open.sdk.request.auth;
import java.io.IOException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.auth.GetTokenResponse;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class GetTokenRequest extends BaseRequest<GetTokenResponse> {


	
	@Override
	public String getApiMethod() {
		return "auth/getToken";
	}


	@Override
	public String getAppParams() throws IOException {
	    return "";
	}

	@Override
	public Class<GetTokenResponse> getResponseClass() {
		return GetTokenResponse.class;
	}

}	