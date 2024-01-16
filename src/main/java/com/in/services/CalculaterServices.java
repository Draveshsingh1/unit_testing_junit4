package com.in.services;

public  class CalculaterServices {

    public static int addtwoNumber(int a , int b){
        return a+b;
    }

    public static int subtwoNumber(int a , int b){
        return a-b;
    }

    public static float divtwoNumber(int a, int b){
        return a/b;
    }

    public static int nNumber(int ...number){
        int s=0;
        for(int n:number){
            s+=n;
        }
        return s;
    }
}
