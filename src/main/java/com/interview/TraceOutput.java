package com.interview;

import java.io.IOException;

public class TraceOutput {
    int y= 2;
    int x= y+2;
    public static void main(String[] args) {
        new Test1().method(null);

        int i=5;
        System.out.println(i+""+5); //55

        System.out.println(10*20+"Test"); //200Test
        System.out.println("Test"+10*20); //Test200

        //for( i=0; 0; i++){ } // boolean required

        Integer int1 = new Integer(201);
        Integer int2 = new Integer(201);
        if(int1==int2) System.out.println("int1==int2"); // false
        if(int1.equals(int2)) System.out.println("int1.equals(int2)"); //true

        Test3 test3 = new Test3();
        test3.run(); // thread Run
        test3.start(); // thread Run

        Integer num1 = 200;
        Integer num2 = 200;
        Integer num3 = 500;
        Integer num4 = 500;
        if(num1==num2) System.out.println("True"); //false
        if(num3==num4) System.out.println("True"); //false

        TraceOutput test1= new TraceOutput();
        System.out.println("test1 x= "+test1.x +" test1 y= "+test1.y); //t est1 x= 4 test1 y= 2
    }
}

class Test1{

     public void method(Object object)  {
         System.out.println("Object");
     }

    public void method(String string){
        System.out.println("String");
    }

    //public void method(Integer i){
    //    System.out.println("Integer");
    //}

    public void method(int i) throws IOException{
        System.out.println("int");
    }

    public final void method(double d){
        System.out.println("double");
    }

}

class Test2 extends Test1 {

    public void method(int i) throws IOException{
        System.out.println("int");
    }

    //public final void method(double d){  //  final cant override
    //        System.out.println("double");
    //    }
}

class Test3 extends Thread{

    @Override
    public void run() {
        System.out.println("thread Run");
    }
}