package com.me.tutorial.anno;

/**
 * Created by wanatchapong
 */
public class MyClass extends MySuperClass {

    @MyAnnotation(name = "id")
    private Integer id;

    @MyAnnotation(name = "name")
    private String name;

    @MethodAnno1(number = 1)
    @MethodAnno2(number = 2)
    public String getAnno(Integer param) {
        System.out.println("param : " + param);
        return "getAnno";
    }

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
}
