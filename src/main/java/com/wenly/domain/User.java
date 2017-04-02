package com.wenly.domain;

import java.io.Serializable;

/**
 * Created by root on 17-3-31.
 */
public class User implements Serializable {
    // 用户标识
    private Integer id;
    // 用户姓名
    private String name;
    // 用户年龄
    private Integer age;

    // 无参数构造器
    public User() {
        super();
    }
    // 有参数构造器
    public User(String name, Integer age) {
        super();
        this.id = 0;
        this.name = name;
        this.age = age;
    }
    public User(Integer id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // setter和getter方法
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
