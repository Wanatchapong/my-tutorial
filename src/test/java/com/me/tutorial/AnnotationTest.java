package com.me.tutorial;

import com.me.tutorial.anno.MyAnnotation;
import com.me.tutorial.anno.MyClass;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by wanatchapong
 */
public class AnnotationTest {

    @Test
    public void test() throws Exception {
        Field[] fields = MyClass.class.getDeclaredFields();
        System.out.println("fields from this class");
        for (Field field : fields) {
            System.out.println("field name : " + field.getName() + ", type : " + field.getType());
        }

        Class superclass = MyClass.class.getSuperclass();
        if (superclass != null) {
            System.out.println("fields from super class");
            Field[] superClassFields = superclass.getDeclaredFields();
            for (Field field : superClassFields) {
                System.out.println("field name : " + field.getName() + ", type : " + field.getType());
            }
        }

        Annotation[] annotations = MyClass.class.getAnnotationsByType(MyAnnotation.class);
        for (Annotation a : annotations) {
            System.out.println(a.annotationType() + " , ");
        }
    }
}
