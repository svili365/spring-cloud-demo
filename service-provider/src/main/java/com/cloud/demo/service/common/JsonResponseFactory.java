package com.cloud.demo.service.common;

/**
 * @author lishiwei
 **/
public class JsonResponseFactory {

  public static JsonResponse success() {
    return success(null);
  }

  public static JsonResponse success(Object data) {
    return new JsonResponse(200, null, data);
  }

  public static JsonResponse error(int status,String message) {
    return new JsonResponse(status, message, null);
  }

}
