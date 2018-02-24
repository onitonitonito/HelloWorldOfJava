package com.company;

public class ClassMethod {

    public int sum(int a, int b) {
        // 01. TYPICAL = IN / OUT
        return a + b;
    }

    public String sayHiAyo() {
        // 02. NO-IN/ OUT
        return "Hello~!... A-Yo!!";
    }

    public void tellSum(int a, int b) {
        // 03. IN / NO-OUT
        System.out.printf("%s + %s = %s, is the answer!", a, b ,(a + b));
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        ClassMethod myTest = new ClassMethod();
        int c = myTest.sum(a, b);

        System.out.println("The answer is " + c);
        System.out.println(myTest.sayHiAyo());
        myTest.tellSum(a, b);

    }
}

