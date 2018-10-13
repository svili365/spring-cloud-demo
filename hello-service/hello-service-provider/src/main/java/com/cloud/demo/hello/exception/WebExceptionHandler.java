package com.cloud.demo.hello.exception;

import com.alibaba.fastjson.JSON;
import com.cloud.demo.hello.common.JsonResponseFactory;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author lishiwei
 **/
@ControllerAdvice
public class WebExceptionHandler {

  private final Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

  @ExceptionHandler(value = IncServiceException.class)
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public Object handleServiceException(IncServiceException exception) {

    return JsonResponseFactory.error(exception.getCode(), exception.getMessage());
  }

  @ExceptionHandler(value = Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Object handleException(Exception exception) {

    printLog(exception);

    return JsonResponseFactory.error(exception.getMessage());
  }

  /**
   * 打印异常日志 </br> 日志格式：{method} {url} parameters={parameters}
   */
  private void printLog(Exception exception) {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes()).getRequest();
    String msg = "%s %s parameters=%s";
    logger.error(String.format(msg, request.getMethod(), request.getRequestURI()),
        JSON.toJSONString(request.getParameterMap()), exception);
  }

}
