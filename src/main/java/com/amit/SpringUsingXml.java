package com.amit;

public class SpringUsingXml {
    
    public SpringUsingXml(){
        System.out.println("In the Constructor");
    }
    private int age;
    private Computer com;
    public SpringUsingXml(int age,Computer com ){
        this.age=age;
        this.com=com;
    }

    

    public void code(){
        System.out.println("In the springxml");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("In the age");
        this.age = age;
    }



    public Computer getCom() {
        return com;
    }



    public void setCom(Computer com) {
        this.com = com;
    }
    
}