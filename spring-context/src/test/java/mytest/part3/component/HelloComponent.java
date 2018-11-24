package mytest.part3.component;

import org.springframework.stereotype.Component;

/**
 * Created by liufq on 9/27/18.
 */
@Component(value="helloComponent")
//@Component("helloComponent")
public class HelloComponent {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
