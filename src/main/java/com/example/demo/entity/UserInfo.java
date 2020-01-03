package com.example.demo.entity;

/**
 * @author Jack
 * @description: TODO
 * @date 2019/6/2617:27
 */
public class UserInfo {
    private int id;
    private String userName;
    private String relName;
    private int age;
    private int balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", relName='" + relName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
