package com.wangzi.girl.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
 * aop记录request信息和 响应结果信息
 * author:prince
 * 2017-11-20 15:23
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger LOG = LoggerFactory.getLogger(HttpAspect.class);


    /**
     * 注明切入点的方法
     */
    @Pointcut("execution(public * com.wangzi.girl.controller.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes servletRequestAttributes  = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
       //url
        LOG.info("url={}",request.getRequestURI());
        //method
        LOG.info("method={}",request.getMethod());
        //ip
        LOG.info("ip={}",request.getRequestURL());
        //类方法
        LOG.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //参数
        LOG.info("arg={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        LOG.info("afterafter");
    }

    /**
     * 记录响应信息
     * 对于controller 后置通知就是处理请求成功之后
     * @param object
     */
    @AfterReturning(returning = "object",pointcut = "log()")
    public  void doAfterReturning(Object object){
        LOG.info("response={}",object.toString());
    }
}

