package com.bjsxt.springbootexceptionandjunit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// 如果项目只有一个启动类，则该注解不需要指定启动类
@SpringBootTest

// 如果有多个启动类，则需要指定其中的某一个作为启动类进行测试
//@SpringBootTest(classes = SpringbootexceptionandjunitApplication.class)
class SpringbootexceptionandjunitApplicationTests {

    @Test
    void contextLoads() {
    }

}
