package mytest.part2;

/**
 * Created by liufq on 9/26/18.
 * 静态工厂
 */
public class FactoryMethodStaticFactory {
    public static Product getInstance() {
        return new Product();
    }
}
