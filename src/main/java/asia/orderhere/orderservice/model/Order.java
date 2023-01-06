package asia.orderhere.orderservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Order {

    private String id;
    private String name;

}
