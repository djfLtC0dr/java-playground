package com.afsdi;

class Test {
    String helloWorld = "Hellow World";
    public String runTest() {
        return helloWorld + " " + "Test passed!!";
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println(new Test().runTest());
    }
}