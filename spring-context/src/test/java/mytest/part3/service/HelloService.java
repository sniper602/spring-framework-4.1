package mytest.part3.service;

import org.springframework.stereotype.Service;

/**
 * Created by liufq on 10/5/18.
 */
@Service(value = "helloService")
public class HelloService {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
