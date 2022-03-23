package cn.qingmings.case1;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Watermelon  implements Fruit {
    @Override
    public Price get() {
        return Price.Watermelon;
    }
}
