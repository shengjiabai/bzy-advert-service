package com.bzy.ad.advice;

import com.bzy.ad.annotation.IgnoreResponseAdvice;
import com.bzy.ad.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
@ControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice {

    /**
     *  判断哪些需要拦截
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        //存在类注解和方法注解不拦截
        if(methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class) 
                ||methodParameter.getMethod().isAnnotationPresent(IgnoreResponseAdvice.class) ){
            return false;
        }

        //swagger页面的请求不拦截
//        if(methodParameter.getDeclaringClass() == ApiResourceController.class ||
//                methodParameter.getDeclaringClass() ==  springfox.documentation.swagger2.web.Swagger2Controller.class
//        ){
//            return false;
//        }
        
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {

        CommonResponse<Object> response = new CommonResponse<>(0, "");
        if (null == o) {
            return response;
        } else if (o instanceof CommonResponse) {
            response = (CommonResponse<Object>) o;
        } else {
            response.setData(o);
        }

        return response;
    }
}
