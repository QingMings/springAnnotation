package cn.qingmings.case1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Orange implements Fruit{
    @Override
    public Price get() {
        return Price.OrangePrice;
    }
}
