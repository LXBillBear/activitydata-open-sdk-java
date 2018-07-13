package com.billbear.activitydata.open.sdk.parser;

import com.billbear.activitydata.open.sdk.exception.SdkException;
import com.billbear.activitydata.open.sdk.response.BaseResponse;


public abstract interface Parser
{
  public abstract <T extends BaseResponse>T parse(String paramString, Class<T> paramClass)
    throws SdkException;
}
