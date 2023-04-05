package com.zyn.pumpkinmarket.filter;

import com.zyn.pumpkinmarket.utils.Resp;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 异常拦截器
 *
 * @Author zyn
 * @Date 2022/6/19 13:07
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Resp exceptionHandler(HttpServletRequest request, Exception e) {
        // 本地自定义异常处理
        if (e instanceof GlobalException) {
            return ((GlobalException) e).getResp();
        }
        //绑定异常是需要明确提示给用户的
        else if (e instanceof BindException) {
            BindException exception = (BindException) e;
            List<ObjectError> errors = exception.getAllErrors();
            String msg = errors.get(0).getDefaultMessage();
            return Resp.SERVER_BIND_ERROR.fillArgs(msg);
            //错误信息设置到CodeMsg中返回
        }
        // 系统异常处理
        return Resp.SERVER_BIND_ERROR.fillArgs(e.getCause() + e.getMessage());
    }
}

