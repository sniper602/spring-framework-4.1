package mytest.part1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liufq on 9/15/18.
 */
public class HelloWorldTest {

    /**
     * 测试xml注入
     * 简单的单例bean
     */
    @Test
    public void testGetBean() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/test/resources/mytest/part1/applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)ac.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());
    }
}
