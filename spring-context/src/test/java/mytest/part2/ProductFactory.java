package mytest.part2;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by liufq on 9/26/18.
 * 实现FactoryBean接口的工厂类
 */
public class ProductFactory implements FactoryBean<Product>{

    @Override
    public Product getObject() throws Exception {
        return new Product();
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
