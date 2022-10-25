package com.liny.mall.config;

import com.liny.mall.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linyi
 * @date 2022/7/29
 * 1.0
 * 捕捉自定义异常返回给前端
 */
@Slf4j
@ControllerAdvice(annotations = {RestController.class, Controller.class})
@ResponseBody
public class GlobalExceptionHandler {
    /**
     * 异常处理方法
     * 可以用来将异常信息返回给前端
     * @return
     */
    @ExceptionHandler(CommonException.class)
    public ResultVo exceptionHandler(CommonException ex) {
        log.error(ex.getMessage());
        //将自定义异常信息返给前端
        return ResultVo.fail().message(ex.getMessage());
    }

}
