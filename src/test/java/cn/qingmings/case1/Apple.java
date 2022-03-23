package cn.qingmings.case1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Apple  implements Fruit{
    @Override
    public Price get() {
        return Price.ApplePrice;
    }
}
