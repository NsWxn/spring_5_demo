package com.nsw.spring5;

/**
 * @author NingShiwei
 * @date 2021/8/14 - 11:07
 */
public class School {

    //创建学生姓名属性
    private  String stname;
    private int stnum;
    private String address="";

    //使用set方法注入属性
    public void setStname(String stname) {
        this.stname = stname;
    }
    public void setStnum(int stnum) {
        this.stnum = stnum;
    }

    public void testSchool() {
        //School sc=new School();
        //sc.setStname("xioaming");
        //sc.setStnum(2019);
        System.out.println(stname+stnum);

    }



}
