package org.example.Enum;

public enum Helper {
    A1(1,'a'),
    A2(2,'b'),
    A3(3,'c');
    private final int a;
    private final char b;
    Helper(int a,char b){
        this.a=a;
        this.b=b;
    }
    public String getElement(){
        return b+"-"+a;
    }

}
