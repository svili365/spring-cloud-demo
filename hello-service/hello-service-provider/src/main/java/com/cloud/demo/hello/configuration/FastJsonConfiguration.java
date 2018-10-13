package com.cloud.demo.hello.configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

/**
 * @author svili
 **/
@Configuration
public class FastJsonConfiguration {

  @Bean
  public HttpMessageConverters fastJsonHttpMessageConverters() {
    //定义一个 convert 转换消息对象；
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

    //处理中文乱码问题
    List<MediaType> fastMediaTypes = new ArrayList<>();
    fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    fastConverter.setSupportedMediaTypes(fastMediaTypes);

    //添加 fastJson 的配置信息，比如: 是否要格式化返回的Json数据；
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
    fastConverter.setFastJsonConfig(fastJsonConfig);

    //将convert添加到converters当中
    return new HttpMessageConverters(fastConverter);
  }

}
