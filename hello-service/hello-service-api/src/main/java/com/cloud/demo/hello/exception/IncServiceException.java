package com.cloud.demo.hello.exception;

import com.netflix.hystrix.exception.HystrixBadRequestException;

/**
 * @author lishiwei
 **/
public class IncServiceException extends HystrixBadRequestException {

  protected int code;

  public IncServiceException(int code, String message) {
    super(message);
    this.code = code;
  }

  public IncServiceException(int code, String message, Throwable t) {
    super(message, t);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

}
