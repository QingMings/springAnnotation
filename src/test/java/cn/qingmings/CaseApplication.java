package cn.qingmings;

import cn.hutool.core.lang.Assert;
import cn.qingmings.case1.Fruit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.stream.Collectors;

@ComponentScan(basePackages = {"cn.qingmings.case1"})
@SpringBootTest
public class CaseApplication {

    @Autowired
    private List<Fruit> fruits;

    @Test
    void testAutowiredFruits(){
        Assert.notNull(fruits,() -> new IllegalArgumentException("Fruits cannot be null !"));
        String s = fruits.stream().map(f -> f.getClass().getSimpleName()).collect(Collectors.joining(","));
        Assert.isTrue("Watermelon,Orange,Banana,Apple".equals(s),"已注入成功");

    }

}
