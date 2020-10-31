package lk.ijse.wsdemo.api;

import lk.ijse.wsdemo.data.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyRestController {

    @GetMapping(path = "/api/hello")
    public Message greeting() {
        Message msg = new Message();
        msg.setSender("Server");
        msg.setMessage("Hello");
        msg.setSentDate(new Date());
        return msg;
    }
}

