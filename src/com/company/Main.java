package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,r,c,fac,nFac=1,rFac=1,fFac=1;
        int total=1;
        System.out.println("n'yi giirniz");
        n=inp.nextInt();
        System.out.print("r'yi giriniz: ");
        r=inp.nextInt();

        //döngüler
        if (n-r >0) {
            for (int i = 1; i <= n; i++) {
                nFac = nFac * i;
            }
            for (int i=1; i <=r; i++)
            {
                rFac= rFac*i;
            }
            fac=n-r;
            for(int i=1; fac <= 1; i++)
            {
                fac=fac*i;
            }
        }
        else {
            System.out.println("n,r den büyük olmalıdır");
        }
        c=nFac/(rFac*fFac)/6;
        System.out.println("C(n,r):" + c);
        // sonucları 6katı veriyordu o yüzden sonda /6 yazdım
        
    }
}
