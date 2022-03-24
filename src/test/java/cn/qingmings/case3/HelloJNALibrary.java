package cn.qingmings.case3;

import com.sun.jna.Library;

public interface HelloJNALibrary extends Library {
    
    public void add(int a, int b , int c);
}
