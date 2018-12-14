package com.hxl.hxlspringboot01.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public static final SerializerFeature[] serializerFeatures = {SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullListAsEmpty, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString};


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    @Bean
    public FastJsonConfig fastJsonConfig() {
        //数据为空展示为空字符串
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(serializerFeatures);
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        return fastJsonConfig;
    }


    /**
     * 使用阿里fastjson转换 不使用jackson
     */
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(FastJsonConfig fastJsonConfig) {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //数据为空展示为空字符串
       /* fastConverter.setFeatures(SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullListAsEmpty);*/
        List<MediaType> fastMediaTypes = new ArrayList<>();
        //解决中文乱码
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        return new HttpMessageConverters(fastConverter);
    }
}
