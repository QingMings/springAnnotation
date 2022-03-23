package cn.qingmings.case1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Banana implements Fruit{
    @Override
    public Price get() {
        return Price.BananaPrice;
    }
}
