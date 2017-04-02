package com.wenly;

import com.wenly.service.SelectService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 77060 on 2017/3/31.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:consumer.xml"});
        context.start();

//        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
////        String hello = demoService.sayHello("world"); // 执行远程方法
//        InsertService demoService = (InsertService)context.getBean("insertService");
//        User userTest = new User("Bill",29);
//        System.out.println(demoService.insertUser(userTest));
//        System.out.println( hello ); // 显示调用结果
//        DeleteService demoService = (DeleteService)context.getBean("deleteService");
//        System.out.println(demoService.deleteUser(7));
//          UpdateService demoService = (UpdateService)context.getBean("updateService");
//          User userTest = new User(4,"Jack",27);
//          System.out.println(demoService.updateUser(userTest));
        SelectService demoService = (SelectService)context.getBean("selectService");
        System.out.println(demoService.selectUser(3).getName());
    }

}