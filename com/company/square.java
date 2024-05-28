package com.company;

class sqr{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class rectangle{
    int l;
    int b;
    public int area1(){
        return l*b;
    }
    public int perimeter1(){

        return 2*(l+b);
    }
}


public class square {
    public static void main(String[] args) {
        sqr s = new sqr();
        s.side = 3;
        System.out.println(s.area());
        System.out.println(s.perimeter());

        rectangle rect = new rectangle();
        rect.l = 2;
        rect.b = 4;
        System.out.println(rect.area1());
        System.out.println(rect.perimeter1());
    }
}

