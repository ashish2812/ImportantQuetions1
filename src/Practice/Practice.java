package Practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Practice p = new Practice();
        p.pzz(4);
    }

    void pzz(int n){
        if(n==0)return;
        System.out.println("Pre "+n);
        pzz(n-1);
        System.out.println("In "+n);
        pzz(n-1);
        System.out.println("Post "+n);
    }
}
