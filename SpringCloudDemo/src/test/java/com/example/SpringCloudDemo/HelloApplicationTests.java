package com.example.SpringCloudDemo;

import com.example.SpringCloudDemo.controller.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by qutf on 2018/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class) //Spring Junit支持
@SpringApplicationConfiguration(classes = SpringCloudDemoApplication.class) //引入启动类
@WebAppConfiguration //开启web应用配置，模拟ServletContext
//@ContextConfiguration("classpath:application.properties")
//@ContextConfiguration(locations={"file:/resources/application.properties"})
public class HelloApplicationTests {

    private MockMvc mvc; //模拟Controller接口发起请求

    @Before  //预加载内容，初始化Controller的模拟
    public void setup() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hello() throws Exception{
//        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)) //perform执行一次请求调用，accept执行接收的数据类型
//            .andExpect(status().isOk()) //andExpext用于判断返回的期望值
//            .andExpect(content().string(equalTo("Hello world!")));
    }
}
