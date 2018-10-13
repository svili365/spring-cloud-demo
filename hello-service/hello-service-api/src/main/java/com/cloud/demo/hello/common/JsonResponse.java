package com.cloud.demo.hello.common;

/**
 * @author lishiwei
 **/
public class JsonResponse<T> {

  private int status;

  private String message;

  private T data;

  public JsonResponse() {
  }

  public JsonResponse(int status, String message, T data) {
    this.status = status;
    this.message = message;
    this.data = data;
  }

  public boolean isSucess() {
    return status == 0;
  }

  public int getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }

  public T getData() {
    return data;
  }
}
