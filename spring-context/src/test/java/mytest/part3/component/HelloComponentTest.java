package mytest.part3.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liufq on 9/27/18.
 */
public class HelloComponentTest {
    @Test
    public void testGetBean() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/test/resources/mytest/part3/applicationContext.xml");
        //FactoryBean生成的bean
        HelloComponent helloComponent = (HelloComponent) ac.getBean("helloComponent");
        System.out.println(helloComponent);
    }
}
