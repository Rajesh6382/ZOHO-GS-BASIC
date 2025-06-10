
// <------------ Integer to Binary ---------> //

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


class Basic{
    public static void main(String[] args) {
        int n=38;
        String s="";
        while(n!=0){
            s=(n%2)+s;
            n=n/2;
        }
        System.out.println(s);
    }
}

// <------------ Optimised Integer to Binary ------------> //

// use string builder instead of string to optimized this code efficiently

// <------------ Integer to Octal ---------> //

class IntToOct{
    public static void main(String[] args) {
        int n=345;
        String s="";
        while(n!=0){
            s=(n%8)+s;
            n=n/8;
        }
    System.out.println(s);
    }
}

// <------------ Integer to hexa ---------> //

class IntToHexa{
    public static void main(String[] args) {
        int n=124;
        String hex="0123456789ABCDEF";
        String res="";

        while(n!=0){
            int rem=n%16;
            res=(hex.charAt(rem))+res;
            n=n/16;
        }
        System.out.println(res);

    }
}


// <------------ Perimeter for the Square -----------> //

class Square{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.print("Enter the side :");
       int size=scn.nextInt();
       int res=4*size;
       System.out.println(res);
    }
}

// <------------ Perimeter for the Rectangle -----------> //

class Rect{
public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.print("Enter the length :");
       int l=scn.nextInt();
       System.out.print("Enter the breath :");
       int b=scn.nextInt();
       int res=2*(l+b);
       System.out.println(res);
    }
}

// <------------ Circumference of the cylinder -----------> //



class CylinderCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        
        double pi = Math.PI;  
        double circumference = 2 * pi * radius;

    
        System.out.print(Math.round(circumference*100.0)/100.0);
    }
}

// <------------ Division and Addition Table  -----------> //

class Table{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the table you want:");
        int num = scn.nextInt();
        int val=0;
        for(int i=1;i<=10;i++){
            val=i+num;
            System.out.println(i +" + "+num+" = "+val);
        }
    }
}


// <------------ ASCII value  -----------> //

class Ascii{
    public static void main(String[] args) {
        System.out.println(" <---- Alph and its Unique Code ---->");
        for(char c = 'A';c<='Z';c++){
            System.out.println(c + " = "+(int)c);
        }
        for(char c = 'a';c<='z';c++){
            System.out.println(c + " = "+(int)c);
        }
    }
}

// <------------ Compute Quoient and Reminder For the given number  -----------> //

class rem{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the divident : ");
        int divident = scn.nextInt();

        System.out.print("Enter the divisor : ");
        int divisor = scn.nextInt();

        int rem = divident % divisor; 
        int quo = divident / divisor; 
        
     System.out.println("Reminder :"+rem);
     System.out.println("Quotient :"+quo);
    }
}

// <------------ Working of keyword long and double  -----------> //

 class Key {
    public static void main(String[] args) {
       
        long population = 7800000000L;  
        System.out.println("population: " + population);

       
        float pi = 3.1415927f; 
        System.out.println("pi: " + pi);

        float largeFloat = 123456789.123456789f;
        System.out.println("Float with large number: " + largeFloat);

        
        long exactValue = 123456789123456789L;
        System.out.println("Long with large integer: " + exactValue);
    }
}

// <------------ Swap two numbers  -----------> //

class Swap{
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int temp=a[1];
        a[1]=a[3];
        a[3]=temp;
        for(int n : a){
            System.out.print(n+ " ");
        }
    }
}

// <------------ Check even or odd  -----------> //

class EvenOrOdd{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = scn.nextInt();
        if(num%2==0){
            System.out.print("The number is even...");
        }else{
          System.out.print("The number is odd...");  
        }
    }
}


// <------------ Check Char vowel or constant  -----------> //

class CheckVowel{
    public static void main(String[] args) {
        char [] a = {'a','e','i','o','u'};
        boolean check = false;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a char :");
        char ch = scn.next().charAt(0);
        for(int i=0;i<a.length;i++){
            if(ch==a[i]){
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("The given char is vowel...");
        }else{
            System.out.println("The given char is constent...");
        }
        
    }
}

//Another method

class Another{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a char :");
        char ch = scn.next().charAt(0);
        if(ch =='a' ||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.print("The given char is vowel...");
        }else{
            System.out.print("The given char is constent...");
        }
    }
}

// <------------ Check max among four numbers  -----------> //



class Max {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the First value : ");
        int num1 = scn.nextInt();
        System.out.print("Enter the second value : ");
        int num2 = scn.nextInt();
        System.out.print("Enter the third value : ");
        int num3 = scn.nextInt();
        System.out.print("Enter the Fourth value : ");
        int num4 = scn.nextInt();

        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            System.out.println("First number is the greatest...");
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            System.out.println("Second number is the greatest...");
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            System.out.println("Third number is the greatest...");
        } else {
            System.out.println("Fourth number is the greatest...");
        }
    }
}


// <------------ Quaratic equation -----------> //




 class QuadraticSolverInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero).");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}


// <------------ To Check whether a num is pos or neg -----------> //

class PosOrNeg{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number you want to check :");
        int num = scn.nextInt();

        if(num >0){
            System.out.print("The given number is postive...");
        }else{
            System.out.print("The given number is negative...");
        }
    }
}


// <------------ To Check char is alph or not -----------> //

class Alph{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the char :");

        char ch = scn.next().charAt(0);

        if((ch >='A' && ch <='Z') || (ch >='a' && ch <='z')){
            System.out.print("The given letter is an alph letter");
        }else{
            System.out.print("The given letter is not an alph letter");
        }
    }
}

// <------------ Sum of n natural num and find the largest digit -----------> //



class SumofNatural {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scn.nextInt();

        int val = num * (num + 1) / 2;  
        System.out.println("Sum of natural numbers: " + val);

        int max = Integer.MAX_VALUE;

        while (val != 0) {
            int digit = val % 10;    
            if (digit < max) {
                max = digit;
            }
            val = val / 10;
        }
        System.out.println("The greatest digit in the sum is: " + max);
        scn.close();
    }
}

// <------------ AND Gate  -----------> //

//Write a function areBothEven(int a, int b) that returns true if both numbers are even.

class And{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num = scn.nextInt();
        System.out.print("Enter the second number :");
        int num1 = scn.nextInt();

        if((num%2==0)&&(num1%2==0)){
            System.out.println("The two numbers are even");
        }else{
            System.out.println("The two numbers are not even");
        }
    }
}

// 

// <------------ Two concntric circle  -----------> //

 class ConcentricCircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of smaller circle : ");
        double r1 = scanner.nextDouble();
        
        System.out.print("Enter radius of larger circle : ");
        double r2 = scanner.nextDouble();
        
        if (r2 <= r1) {
            System.out.println("Error: Larger radius must be greater than smaller radius.");
        } else {
            double area = Math.PI * (r2 * r2 - r1 * r1);
            System.out.printf("Area of the space between the circles:", area);
        }
        
        scanner.close();
    }
}

// <------------ 19 expresstion  -----------> //

class Exp{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value of A :");
        int a = scn.nextInt();
        System.out.print("Enter the value of B :");
        int b = scn.nextInt();

        // int c = ++a- --b;
       // int d= a-- % b++;
       // System.out.print(c);
       // System.out.print(d);

       int e = a*=b+=5;
       System.out.println(e);
       int f = 69>>>2;
       System.out.println(f);
    }
}

// <------------ 20 expresstion  -----------> //

class Exp2{
    public static void main(String[] args) {
        int a=18;
        int x=10;
        int y=10;
        int b=5;
        a+= ++a + ++a - a + a--;
        System.out.println(a);

        x = ++x * 2 + 3 * --x;
        System.out.println(x);

        int z = (++y* (y++ + 5));
        System.out.println(z);

       int x1=++b - b++ + --b;
       System.out.println(x1);

    }
}

// <------------ 25 Final Keyword  -----------> //

// FinalKeywordDemo.java
final class FinalClass {
    public void display() {
        System.out.println("This is a final class method.");
    }
}

class Parent {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // Uncommenting the below method will cause a compilation error:
    // public void show() {
    //     System.out.println("Trying to override final method.");
    // }
}

class FinalKeywordDemo {
    public static void main(String[] args) {
        final int x = 10; // final variable
        // x = 20; // Uncommenting this will cause an error

        System.out.println("Value of final variable x: " + x);

        FinalClass obj1 = new FinalClass();
        obj1.display();

        Child obj2 = new Child();
        obj2.show();
    }
}

// <------------ 26 Merge dublicate & add dublicate in sep array   -----------> //




class Merge {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 13};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};

        
        Set<Integer> myset = new HashSet<>();
        for (int num : arr1) {
            myset.add(num);
        }
        for (int num : arr2) {
            myset.add(num);
        }

        
        System.out.println("Unique elements (Union): " + myset);

        
        List<Integer> duplicates = new ArrayList<>();
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    
                    if (!duplicates.contains(num1)) {
                        duplicates.add(num1);
                    }
                }
            }
        }

       
        System.out.print("Common elements (Intersection): ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}


// <------------ 27 Right Rotate Matrix   -----------> //

class Rotate {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original Array:");
        printMatrix(arr);

        System.out.println("Right Rotate Matrix:");
        int[][] rotated = rotateMatrix(arr);
        printMatrix(rotated);
    }

    public static void printMatrix(int[][] arr) {
        for(int[] row : arr) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] arr) {
        int n = arr.length;       
        int m = arr[0].length;    

        int[][] rotated = new int[m][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rotated[j][n - 1 - i] = arr[i][j];  
            }
        }
        return rotated;
    }
}

 // <------------ 28 Alternate Sorting   -----------> //

 class AlterSort{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int [] a = new int[arr.length];

        int left =0;
        int right = arr.length-1;
        int index=0;

        while(left <= right){
            if(index%2==0){
                a[index]=arr[left];
                left++;
            }else{
                a[index]=arr[right];
                right--;
            }
            index++;
        }
        System.out.print(Arrays.toString(a)); 
    }
}

 // <------------ 29 Factorial Number   -----------> //

 

class Fact {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);

        int rev = 0;
        int temp = fact;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed factorial: " + rev);
    }
}

// <------------ 30 Add ele in odd pos   -----------> //

class AddOdd{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                sum = sum+a[i];

            }
        }
        System.out.println(sum);
    }
}


// <------------ 31 Add ele in even pos   -----------> //

class Addeven{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                sum = sum+a[i];

            }
        }
        System.out.println(sum);
    }
}

// <------------ 32 2'd largest in a array   -----------> // 

class Lar{
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};
        int first =0;
        int second =0; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first=arr[i];
            }
             if(arr[i]>second && arr[i] != first){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}

// <------------ 32 2'd smallest in a array   -----------> // 

class Small {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < first) {
                second = first;
                first = arr[i];
            } else if(arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second smallest: " + second);
    }
}


// <------------ 33  len of array    -----------> // 

class ArrayLen{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11};
        int n = a.length;
        System.out.println(n);
    }
}


// <------------ 34  len of array    -----------> // 

class CopyArray{
    public static void main(String[] args) {
        int []a= {1,2,3,4,5,6};
        int [] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}

// <------------ 37 frequency each ele  of array    -----------> //

class Frq {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3, };
        int max = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        
        int[] fre = new int[max + 1];
        for (int val : a) {
            fre[val]++;
        }

        for (int i = 0; i <= max; i++) {
            if (fre[i] > 0) {
                System.out.println(i + " : " + fre[i] + " times");
            }
        }
    }
}

// <------------ 38 Delete an ele in an array    -----------> //

class DelArray{
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int pos = 1;

        for(int i=pos;i<a.length-1;i++){
            a[i]=a[i+1];
        }

        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]+" ");
        }
    }
}

// <------------ 39 Avg of an array   -----------> //

class Avg{
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6};
        int divisor  = a.length;
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        double avg = (double)sum/divisor;
        System.out.println("The avg 0f the array:"+avg);
    }
}

// <------------ 40 Inverse array   -----------> //

class Inv {
    public static void main(String[] args) {
        int[] a = {2, 0, 1, 3};
        int[] inv = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            inv[a[i]] = i;
        }

        for (int i = 0; i < inv.length; i++) {
            System.out.print(inv[i] + " ");
        }
    }
}


