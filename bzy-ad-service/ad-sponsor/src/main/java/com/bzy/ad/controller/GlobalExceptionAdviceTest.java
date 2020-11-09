package com.bzy.ad.controller;

import com.bzy.ad.exception.AdException;
import com.bzy.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 */
//@RestControllerAdvice
public class GlobalExceptionAdviceTest {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req,
                                                     AdException ex) {
        CommonResponse<String> response = new CommonResponse<>(-1,
                "business error");
        response.setData(ex.getMessage());
        return response;
    }
}
