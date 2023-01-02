package com.company;
class GenericMethod<E>
{
    public <E> void swap(E[] arr, int i, int j)
    {
        E e=arr[i];
        arr[i]=arr[j];
        arr[j]=e;
        System.out.println("after swaping");
        for(E e1:arr)
        {
            System.out.println(e1);
        }
    }

}
public class genericmethodexample
{
    public static void main(String[] args)
    {
        Integer array[]={2,3};
        GenericMethod<Integer> s=new GenericMethod();
        System.out.println("before swapping");
        for(Integer a:array)
    {
        System.out.println(a);
    }
        s.swap(array,0, 1);
    }
}
