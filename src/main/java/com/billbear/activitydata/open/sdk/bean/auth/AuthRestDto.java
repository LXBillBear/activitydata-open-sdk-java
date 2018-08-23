package com.billbear.activitydata.open.sdk.bean.auth;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * 
 * @author billbear.sdk.tool
 *
 */
public class AuthRestDto{

 
	
	@JsonProperty("token")	
	private String token;                 
    

 
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}                
    

}