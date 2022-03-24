package cn.qingmings.case3;

import com.sun.jna.Native;

public class TestJNA {

    
    
    public static void main(String[] args) {
        final HelloJNALibrary jnaLibrary  = Native.load("helloJNA", HelloJNALibrary.class);
    
    int a = 10;
    int b = 10;
    int c  = 0;;
    jnaLibrary.add(a, b, c);
    System.out.println(c);
    }
}
