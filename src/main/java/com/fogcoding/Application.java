package com.fogcoding;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @version 1.0
 * @author: fogcoding
 * @date: 2020/12/30 19:15
 * @e-mail: thinfog@126.com
 */
//@SpringBootApplication
//@ImportResource(locations = {"classpath:../beantest.xml"})
public class Application {

    public static void main(String[] args) {

        /**
         * 1.直接可执行jar包 （直接用spring-boot形式打包即可实现）
         * 2.梳理出bin脚本目录,conf配置目录，lib依赖目录
         * 3.支持动态拓展和功能解耦
         */

        System.out.println("当前执行文件的路径为：" + pwd());

        String[] locations = {"file:D:\\workspace\\tmp\\ApplicationTemplate\\config\\application.xml"};
//        String[] locations = {"classpath*:config/application.xml"};

//        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(locations);
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(locations);

        System.out.println(new Gson().toJson(fileSystemXmlApplicationContext.getEnvironment().getSystemProperties()));
        for (String s :fileSystemXmlApplicationContext.getBeanDefinitionNames()){
            System.out.println(s);
        }




//        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class,args);
//        System.out.println(new Gson().toJson(applicationContext.getEnvironment().getSystemProperties()));


    }

    public static String pwd(){
        String jar_path = Application.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println("读取到的路径: " + jar_path);
        int position = jar_path.lastIndexOf("/");
        String curent_path = jar_path.substring(0,position);

        System.out.println("读取到的路径: " + curent_path);
        return curent_path;
    }

}
