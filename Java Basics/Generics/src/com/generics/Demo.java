package com.generics;

//single generic type
public class Demo<T> {
    T height;

    Demo(T height){
        this.height = height;
    }

    T displayHeight(){
        return height;
    }
}
