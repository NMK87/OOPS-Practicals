package org.example;

import java.util.*;

public class Pallindrome {

    public static void main(String[] args) {

        //Pallindrome
//        int n = 121;
//        int rev=0;
//        int sum = 0;
//        int temp = 0;
//
//        temp = n;
//        while(n!=0){
//            rev = n%10;
//            sum = (sum*10) +  rev;
//            n = n/10;
//        }
//
//        if(sum == temp){
//            System.out.println("pallindrome");
//        }
//        else{
//            System.out.println("not pallindrome");
//        }

//        factorial
//        int fact=1;
//        int n=5;
//
//        for(int i=1; i<=n; i++){
//            fact = fact*i;
//        }
//        System.out.println(fact);

//        List numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(90);
//        numbers.add(70);
//        numbers.add(30);
//        numbers.add(40);
//
//        Iterator i = numbers.iterator();
//        Collections.reverse(numbers);
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }

//        int num;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        num = sc.nextInt();
//
//        if(isAmstrong(num)){
//            System.out.println("Amstrong");
//        }
//        else{
//            System.out.println("not");
//        }


//    static boolean isAmstrong(int n){
//        int temp=0,count=0,rem=0, sum=0;
//
//        temp = n;
//        while(temp>0){
//            temp = temp/10;
//            count++;
//        }
//        temp = n;
//        while(temp>0){
//            rem= temp%10;
//            sum+=Math.pow(rem,count);
//            temp = temp/10;
//        }
//        if(sum == n)
//            return true;
//        else
//            return false;
//
//
//    }

//        String name = "neha";
//        String rev=" ";
//        char ch;
//
//        for(int i = 0; i<name.length();i++){
//            ch = name.charAt(i);
//            rev = ch + rev;
//        }
//        System.out.println(rev);

//        int n = -9;
//        if (n > 0) {
//            System.out.println("perfect");
//        }
//        else{
//            n = n*-1;
//            System.out.println("perfect");
//        }

//        int a = 30,b=40,temp=0;
//
//        temp = a;
//        a=b;
//        b=temp;
//
//        System.out.println(a+" "+b);

//        int n= 5,a=0,b=1,sum=0;
//                if(n==1){
//                    System.out.println(a);
//                }
//        System.out.print(a+" "+b);
//                for(int i =0; i<n-2;i++){
//                    sum=a+b;
//                    System.out.print(" "+sum);
//                    a=b;
//                    b=sum;
//                }

//       int[] a={1,2,3,4,5};
//        System.out.println(secondLargest(a,5));
//    
//
//    public static int secondLargest(int a[],int n){
//
//        int temp=0;
//        for(int i = 0; i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        return a[n-2];
        
        int m=0,flag=0;
        int n=5;
        
        m = n/2;
        if(n==0 || n==1){
            System.out.println("not");
        }
        else{
            for (int i = 2;i<=m; i++){
                if(n%i==0){
                    System.out.println("not prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");
            }
        }
    }
}
