package com.nsw.spring5;

/**
 * @author NingShiwei
 * @date 2021/8/12 - 17:35
 * 使用有参数的构造方法注入
 */
public class Orders {
    //属性
    private String name;
    private String address;
    //有参构造
    public Orders(String name,String address){
        this.name=name;
        this.address=address;

    }
    public void ordersTest(){
        System.out.println(name+address);
    }

}
