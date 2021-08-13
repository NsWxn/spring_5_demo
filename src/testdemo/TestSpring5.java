package testdemo;

import com.nsw.spring5.Orders;
import com.nsw.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

/**
 * @author NingShiwei
 * @date 2021/8/10 - 18:54
 */
public class TestSpring5 {

    /*@Test
    public void testAdd(){
        //加载spring配置文件
        //利用xml配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象
        User user=context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }*/

    @Test
    public void testOrders(){
        //加载spring配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml;");
        //获取配置创建的对象
        Orders orders=context.getBean("orders",Orders.class);
        //System.out.println(orders);
        orders.ordersTest();
    }


}
