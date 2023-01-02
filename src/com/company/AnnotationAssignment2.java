package com.company;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
    int authorId();
    String author();
    String supervisor();
    String Date();
    String Time();
    int version();
}
@info(authorId=1,author="abc",supervisor="f",Date="28/07/2002",Time="5:30",version=5)
class CustomAnnotation
{
    String name;
    int version;
  CustomAnnotation(String name,int version)
  {
      this.name=name;
      this.version=version;
  }
}
public class AnnotationAssignment2
{
    public static void main(String[] args)
    {
        CustomAnnotation d=new CustomAnnotation("d",5);
        Class c =d.getClass();//Returns the runtime object of this class
        Annotation an=c.getAnnotation(info.class);
        info o=(info)an;
        System.out.println(o.authorId());
        System.out.println(o.author());
        System.out.println(o.supervisor());
        System.out.println(o.Date());
        System.out.println(o.Time());
        System.out.println(o.version());

    }
}
