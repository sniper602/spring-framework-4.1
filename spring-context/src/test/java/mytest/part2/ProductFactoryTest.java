package mytest.part2;

import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liufq on 9/26/18.
 * FactoryBean测试
 */
public class ProductFactoryTest {

    @Test
    public void testGetBean() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/test/resources/mytest/part2/applicationContext.xml");
        //FactoryBean生成的bean
        Product product = (Product)ac.getBean("productFactory");
        Product product1 = (Product)ac.getBean("productFactory");
        //FactoryBean本身的bean
        FactoryBean<Product> product2 = (FactoryBean)ac.getBean("&productFactory");
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product==product1);

        //factory-method
        //factory-bean
        Product product3 = (Product) ac.getBean("product1");
        //静态
        Product product4 = (Product) ac.getBean("product2");
        System.out.println(product3);
        System.out.println(product4);
    }
}
