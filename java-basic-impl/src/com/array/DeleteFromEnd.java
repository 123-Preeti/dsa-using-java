package com.array;

public class DeleteFromEnd {
    static int count = 5;
    int i;
    public static void main(String[] args) {

        int a[] = { 12, 34, 45, 6, 13 };
        DeleteFromEnd obj = new DeleteFromEnd();

        obj.print(a);
        obj.deleteFromEnd(a);
        obj.print(a);

        obj.deleteValue(a, 32);
        obj.print(a);

        obj.deleteFromPosition(a, 2);
        obj.print(a);
    }
    //delete from end
    public void deleteFromEnd(int a[]) {
        if(a.length <= 0){
            return;
        }
        count-- ;
    }
    //print
    public void print(int a[]) {
        for(int i = 0 ; i <count; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
    //delete a particular value

    public void deleteValue(int a[], int val){
        int i;
        for(int i = 0; i< count; i++){
            if(a[i] == val){
                break;
            }
        }
        if(i == count) {
            System.out.println("Value does not exist");
            return ;
        }

        for(int j = i; j <count; j++){
            a[j] = a[j+1];
        }
        count--;
    }

    //delete from a particluar position

    public void deleteFromPosition(int a[], int position){
        if(position > count || position <= 0){
            System.out.println("Invalid position");
            return;
        }
        for(int i = position -1; i < count-1; i++){
            a[i] = a[i+1];
        }
        count--;
    }
}











