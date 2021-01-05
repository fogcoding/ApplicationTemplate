package com.fogcoding.XMLAop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Protector {

    @Before("execution(* com.fogcoding.templates.XMLAop.pojo.LandLord.service())")
    public void before(){
        System.out.println("清场");
        System.out.println("封路");
    }

    @After("execution(* com.fogcoding.templates.XMLAop.pojo.LandLord.service())")
    public void after(){
        System.out.println("握手");
        System.out.println("拥抱");
        int a = 10;

    }

    @Pointcut("execution(* com.fogcoding.templates.XMLAop.pojo.LandLord.service())")
    public void IRob(){
    }

    @Before("IRob()")
    public void Ibefore(){
        System.out.println("调查");
        System.out.println("布置陷阱");
    }

    @After("IRob()")
    public void Iafter(){
        System.out.println("寻找时机");
        System.out.println("实施抢劫");
    }




}
