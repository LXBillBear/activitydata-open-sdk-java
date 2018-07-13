package com.billbear.activitydata.open.sdk.test;

import com.billbear.activitydata.open.sdk.DefaultBillBearClient;
import com.billbear.activitydata.open.sdk.exception.SdkException;
import com.billbear.activitydata.open.sdk.request.city.GetCitysRequest;
import com.billbear.activitydata.open.sdk.response.city.GetCitysResponse;

public class CityTest {
	
	  public static void main(String[] args) throws SdkException {
//		Long appId=18081818188888l;
//		String sign="billbearsandbox";
//		DefaultBillBearClient client=new DefaultBillBearClient("https://open.billbear.cn/activitydata-open-sandbox",appId, sign);
//		BaseRestRequest request=new BaseRestRequest();
//		System.out.println((client.execute(request).getData().get(0).getCityName()));
		  Long appId=18081818188888l;//请替换成专属appId
		  String sign="billbearsandbox";//请替换成专属sign
		  String url="https://open.billbear.cn/activitydata-open-sandbox";//此地址为沙箱环境,正式环境为https://open.billbear.cn/activitydata-open
		  DefaultBillBearClient client=new DefaultBillBearClient(url,appId, sign);
		  GetCitysRequest request=new GetCitysRequest();
		  GetCitysResponse response=client.execute(request);
		  System.out.println(response.getData().get(0).getCityName().toString());
	  }

}
