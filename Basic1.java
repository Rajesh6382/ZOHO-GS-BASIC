
import java.util.Scanner;

//<<<<<<<<<<<<  41-43 Patterns  >>>>>>>>>>>>//

class Basic1{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int count =1;
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }else{
                   System.out.print(count +" ");
                   count++;
                }
                
            }
            System.out.println();
        }
    }
}

class Pattern1{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }else{
                   System.out.print(i +" ");
                   
                }
                
            }
            System.out.println();
        }
    }
}

class Pattern2{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }else{
                   System.out.print( "* ");
                }
                
            }
            System.out.println();
        }
    }
}

//<<<<<<<<<<<<  44 Patterns  >>>>>>>>>>>>//

class pattern4{
    public static void main(String[] args) {
        int n=25;
        int l=0;
        for(int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }else{
                l=i;
            }
            for(int j=1;j<=n;j++){
                if(j<=l){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}

//<<<<<<<<<<<<  46 Print odd num in between the range  >>>>>>>>>>>>//

class Range{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number to Start:");
        int start = scn.nextInt();
        System.out.print("Enter the Number to End:");
        int end = scn.nextInt();
        for(int i=start;i<end;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
    }
}


//<<<<<<<<<<<<  47 Print Alp till the input  >>>>>>>>>>>>//

class Alp{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a char:");
        char a = scn.next().charAt(0);
        for(char c = 'A';c<=a;c++){
            System.out.print(c+" ");
        }
    }
}

//<<<<<<<<<<<<  48 sum the number   >>>>>>>>>>>>//

class Sum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scn.nextInt();
        int original = num;
        int rev=0;
        while (num != 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        
        int total = original + rev;
        System.out.print(total);
    }
}

//<<<<<<<<<<<<  49 rev the string using recursion   >>>>>>>>>>>>//



class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String sentence = sc.nextLine();
        
        reverse(sentence);
    }

    static void reverse(String str) {
        if (str.isEmpty()) {
            return;
        }

        int spaceIndex = str.indexOf(' ');

        if (spaceIndex == -1) {
            System.out.print(str);
        } else {
            reverse(str.substring(spaceIndex + 1));
            System.out.print(" " + str.substring(0, spaceIndex));
        }
    }
}


//<<<<<<<<<<<<  50 rev the string using recursion   >>>>>>>>>>>>//

class NumberToWords {
    
    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int num = sc.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Number out of range!");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convertToWords(num));
        }
    }

    static String convertToWords(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 100) {
            sb.append(ones[num / 100]).append(" Hundred");
            num %= 100;
            if (num != 0) sb.append(" and ");
        }

        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            sb.append(ones[num]);
        }

        return sb.toString().trim();
    }
}


class NumberToWord {
    
    static String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int num = sc.nextInt();

        if (num < 0 || num > 999) {
            System.out.println("Number out of range!");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convertToWords(num));
        }
    }

    static String convertToWords(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 100) {
            sb.append(ones[num / 100]).append(" Hundred");
            num %= 100;
            if (num != 0) sb.append(" and ");
        }

        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            sb.append(ones[num]);
        }

        return sb.toString().trim();
    }
}


//leetcode sum no : 1800
class sol{
    public static void main(String[] args) {
        int [] arr = {12,17,15,13,10,11,12};
        int max=0;
        int start=0;
        int end=0;
        int sum=0;
        while(end<arr.length){
            if(arr[start]<=arr[end]){
                sum = sum+arr[end];
                end++;
            }else{
                start=end;
                sum=0;
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}

