package org.example.CustomArrayList;

import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {

    public T getFirst() {
        return this.get(0);
    }

    public T getLast() {
        return this.get(this.size() - 1);
    }

    public void addAtIndex(int index, T element) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.add(index, element);
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        this.remove(index);
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList=new CustomArrayList<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(4);
        customArrayList.add(5);
        System.out.println("Size : "+customArrayList.size());
        customArrayList.addAtIndex(2,100);
        customArrayList.removeAtIndex(5);
        for(int i:customArrayList){
            System.out.println(i+" ");
        }
    }
}
