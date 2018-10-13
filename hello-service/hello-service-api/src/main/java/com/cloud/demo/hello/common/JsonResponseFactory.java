package com.cloud.demo.hello.common;

/**
 * @author lishiwei
 **/
public class JsonResponseFactory {

  public static JsonResponse<Object> success() {
    return new JsonResponse(0, null, null);
  }

  public static <T> JsonResponse<T> success(T data) {
    return new JsonResponse(0, null, data);
  }

  public static <T> JsonResponse<T> error(String message) {
    return error(999, message);
  }

  public static <T> JsonResponse<T> error(int status, String message) {
    return new JsonResponse<>(status, message, null);
  }

}
