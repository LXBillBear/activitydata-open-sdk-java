package com.billbear.activitydata.open.sdk;

import java.util.Map;

import com.billbear.activitydata.open.sdk.exception.SdkException;
import com.billbear.activitydata.open.sdk.parser.ParserFactory;
import com.billbear.activitydata.open.sdk.request.BaseRequest;
import com.billbear.activitydata.open.sdk.response.BaseResponse;
import com.billbear.activitydata.open.sdk.util.HttpUtil;

public class DefaultBillBearClient implements BillBearClient {
	public static final String CHARSET_UTF8 = "UTF-8";

	private String serverUrl;
	private String sign;
	private int connectTimeout = 0;
	private int readTimeout = 0;
	private Long appId;

	public DefaultBillBearClient(String serverUrl, Long appId, String sign) {
		this.serverUrl = serverUrl;
		this.appId = appId;
		this.sign = sign;
	}

	public DefaultBillBearClient(String serverUrl, Long appId, String sign,
			int connectTimeout, int readTimeout) {
		this(serverUrl, appId, sign);
	}

	public <T extends BaseResponse> T execute(BaseRequest<T> request)
			throws SdkException {
		try {
			String url = buildUrl(request);
			
			String rsp = HttpUtil.doPost(url, null, this.connectTimeout,
					this.readTimeout);
			T resp = parse(rsp, request.getResponseClass());
			StringBuffer sb = new StringBuffer();
			sb.append(url);
			resp.setUrl(sb.toString());

			return resp;
		} catch (Exception e) {
			throw new SdkException("server error!");
		}
	}

	private <T extends BaseResponse> String buildUrl(BaseRequest<T> request)
			throws Exception {
		Map<String, Object> params = request.getSysParams();
		String json=request.getAppParams();
		StringBuilder sb = new StringBuilder(this.serverUrl);
		sb.append("/").append(request.getApiMethod());
		params.put("sign", this.sign);
		params.put("appId", this.appId);		
		params.put("params", json);		
		sb.append("?");
		sb.append(HttpUtil.buildQuery(params, "UTF-8"));
		return sb.toString();
	}

	private <T extends BaseResponse> T parse(String rsp, Class<T> responseClass)
			throws SdkException {
		return ParserFactory.getJsonParser().parse(rsp, responseClass);
	}

}