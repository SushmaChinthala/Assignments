package com.company;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Smartphone
{
    String os();
    int version();
}
@Smartphone(os="Andriod",version=6)
class Nokiaseries
{
    String mode;
    int size;
    public Nokiaseries(String mode,int size)
    {
        this.mode=mode;
        this.size=size;
    }
}
public class AnnotationExample
{
    public static void main(String[] args)
    {
        Nokiaseries n=new Nokiaseries("Fire",5);
        Class c=n.getClass();
        Annotation o=c.getAnnotation(Smartphone.class);
        Smartphone s=(Smartphone)o;
        System.out.println(s.version());
        System.out.println(s.os());
    }
}
