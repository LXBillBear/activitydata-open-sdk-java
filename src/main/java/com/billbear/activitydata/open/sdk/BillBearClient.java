package com.billbear.activitydata.open.sdk;

import com.billbear.activitydata.open.sdk.response.BaseResponse;
import com.billbear.activitydata.open.sdk.exception.SdkException;
import com.billbear.activitydata.open.sdk.request.BaseRequest;

public abstract interface BillBearClient
{
  public abstract <T extends BaseResponse> T execute(BaseRequest<T> request)
    throws SdkException;
} 
