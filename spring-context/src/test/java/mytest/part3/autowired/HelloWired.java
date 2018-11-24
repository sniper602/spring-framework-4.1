package mytest.part3.autowired;

import mytest.part3.component.HelloComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by liufq on 10/5/18.
 */
@Lazy
@Component("helloWired")
public class HelloWired {
    @Autowired
    private HelloComponent helloComponent;

}
