package com.company;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.util.ArrayList;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
String purpose();
}
class Greet
{
    @Test(purpose="That the fallowing method is a test case")
    public void greeting()
    {
        System.out.println("Good Afternoon");
    }
}

 class AnnotationAssignment1
{
    public static void main(String[] args) throws Exception
    {
        Greet e=new Greet();
        Method m=e.getClass().getMethod("greeting");
        Test t=m.getAnnotation(Test.class);
        System.out.println(t.purpose());
    }
}
