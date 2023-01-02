package com.company;
interface Greeting
{
    void greetingMethod();

}
interface Adding
{
    int add(int x,int y);

}
interface StringLength
{
    int Length(String s);
}

public class LambdaExample1 {
    public static void main(String[] args) {
        Greeting GreetingLambdaExpression = () -> System.out.println("Good Morning");
        GreetingLambdaExpression.greetingMethod();
        Greeting innerclassgreeting = new Greeting() {
            public void greetingMethod() {
                System.out.println("Good Morning");
            }
        };
        innerclassgreeting.greetingMethod();
        Adding AddLambdaExpression = (int a, int b) ->
        {
            System.out.println(a + b);
            return a + b;
        };
        AddLambdaExpression.add(5, 6);
        StringLength lamdalength = s ->
        {

            System.out.println(s.length());
            return s.length();

        };
        lamdalength.Length("sushma");
    }
}

