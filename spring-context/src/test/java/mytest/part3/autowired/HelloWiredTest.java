package mytest.part3.autowired;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liufq on 10/5/18.
 */
public class HelloWiredTest {
    @Test
    public void testGetBean() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/test/resources/mytest/part3/applicationContext.xml");
        //FactoryBean生成的bean
        HelloWired helloWired = (HelloWired) ac.getBean("helloWired");
        System.out.println(helloWired);
    }
}
