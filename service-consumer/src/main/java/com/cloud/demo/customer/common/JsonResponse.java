package com.cloud.demo.customer.common;

import com.alibaba.fastjson.annotation.JSONType;

/**
 * @author lishiwei
 **/
@JSONType(orders = { "status", "message", "data" })
public class JsonResponse {

  private int status;

  private String message;

  private Object data;

  JsonResponse(int status,String message,Object data){
    this.status = status;
    this.message = message;
    this.data = data;
  }

  public int getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public Object getData() {
    return data;
  }
}
