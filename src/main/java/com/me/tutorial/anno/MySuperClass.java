package com.me.tutorial.anno;

/**
 * Created by wanatchapong
 */
public abstract class MySuperClass {

    @MyAnnotation(name = "superId")
    private Integer superId;

    @MyAnnotation(name = "superName")
    private String superName;

    public Integer getSuperId() {
        return superId;
    }

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }
}
