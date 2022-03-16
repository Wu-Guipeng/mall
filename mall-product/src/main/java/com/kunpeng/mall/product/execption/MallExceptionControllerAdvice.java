package com.kunpeng.mall.product.execption;

import com.kunpeng.common.exception.BizCodeEnum;
import com.kunpeng.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestControllerAdvice(basePackages = "com.kunpeng.mall.product.controller")
public class MallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{},异常类型: {}",e.getMessage(),e.getClass());
        BindingResult result = e.getBindingResult();
        Map<String, String> map = new HashMap<>();
        if (result.hasErrors()){

            result.getFieldErrors().forEach((item) ->{
                String message = item.getDefaultMessage();
                String field = item.getField();
                map.put(field, message);
            });
        }
        return R.error(BizCodeEnum.VAILD_EXCEPtION.getCode(), BizCodeEnum.VAILD_EXCEPtION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        log.error("错误: ", throwable);
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
