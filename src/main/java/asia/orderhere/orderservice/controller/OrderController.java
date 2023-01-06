package asia.orderhere.orderservice.controller;

import asia.orderhere.orderservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping()
    public Order getOrder(){
        return Order.builder().id(UUID.randomUUID().toString()).name("test").build();
    }
}
