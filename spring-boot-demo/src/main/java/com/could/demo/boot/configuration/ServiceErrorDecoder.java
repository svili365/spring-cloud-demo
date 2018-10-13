package com.could.demo.boot.configuration;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author svili
 **/
@Component
@Configuration
public class ServiceErrorDecoder extends ErrorDecoder.Default {

  private final Logger logger = LoggerFactory.getLogger(ServiceErrorDecoder.class);

  @Override
  public Exception decode(String methodKey, Response response) {
    if (response.status() != HttpStatus.OK.value()) {
      String body = "";
      try {
        if (response.body() != null) {
          body = Util.toString(response.body().asReader());
        }
      } catch (IOException ignored) { // NOPMD
      }

      logger
          .error("HystrixBadRequestException. method : {} ,status : {}, body : {}", methodKey, response.status(),
              body);
    }
    // 只有HystrixBadRequestException不会启用熔断
    // HystrixBadRequestException会在调用处抛出异常,FeignException则走熔断fallback方法
    return super.decode(methodKey, response);
  }
}

