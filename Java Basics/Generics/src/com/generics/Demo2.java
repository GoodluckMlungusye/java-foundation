package com.generics;

//double generic type
public class Demo2<T,Y> {

    T studentName;
    Y marks;

    Demo2(T studentName, Y marks){
        this.studentName = studentName;
        this.marks = marks;
    }

    T displayName(){
        return studentName;
    }
    Y displayMarks(){
        return marks;
    }


}
