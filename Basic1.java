
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

class Prog51
{
    public static void main(String[]args)
    {
        int[]nums = {1,6,2,5,3,4};
        List<Integer>odd = new ArrayList<>();
        List<Integer>even = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                odd.add(nums[i]);
            }
            else
            {
                even.add(nums[i]);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int j = 0, k = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(odd.get(j++) + " ");
            }
            else
            {
                System.out.print(even.get(k++)+ " ");
            }
        }
    }
}

//Program to print the alphabet "C" based on the given numbers
class Prog52
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
               for(int j = 1;j<=n;j++)
               {
                 System.out.print("* ");
               }
            }
            else
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//Program to print a pyramid with numbers increased by 1
class Prog53
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        int count = 1;
            for(int i = 1;i<=n;i++)
            {
                for(int j = 1;j<=n;j++)
                {
                if(j<=(n-i))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(count++ + " ");
                }
                }
                System.out.println("");
            }
    }
}

/*Program to print the given string in an "x" format
1   5
 2 4 
  3  
 2 4 
1   5 */
class Prog54
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(i==j || i+j==n+1)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

/*Program to print the following pattern
4444444
4333334
4322234
4321234
4322234
4333334
4444444 */
class Prog55
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = java.nextInt();
        int mid = n/2;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                int val = Math.max(Math.abs(i - mid), Math.abs(j - mid)) + 1;
                System.out.print(val);
            }
            System.out.println("");

        }
    }
}

//Program to print all the substring of the given string without using strings
class Prog56
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = java.nextLine();
        char[]ch = str.toCharArray();
        for(int i = 0;i<ch.length;i++)
        {
            for(int j = i;j<ch.length;j++)
            {
                for(int k = i;k<=j;k++)
                {
                    System.out.print(ch[k]);
                }
                System.out.println("");
            }
        }
    }
}

//Print the numbers which are mismatched from two array
class Prog57
{
    public static void main(String[]args)
    {
        char[]ch1 = {'a','b','c','d','e','f','g','h','i'};
        char[]ch2 = {'a','b','d','e','e','g','g','i','i'};
        for(int i = 0;i<ch1.length;i++)
        {
            if(ch1[i] == ch2[i])
            {
                continue;
            }
            System.out.println(ch1[i]+""+ch2[i]);
        }
    }
}

//Program to print the sum of 2 huge numbers as separate digits, store them in array and process the result
class Prog58
{
    public static void main(String[]args)
    {
        int[]a = {9,2,8,1,3,5,6,7,3,1,1,6};
        int[]b = {7,8,4,6,2,1,9,9,7};
        int al = a.length - 1;
        int bl = b.length - 1;
        int[]c = new int[(Math.max(al,bl) + 1)];
        int cl = c.length - 1;
        int temp = 0;
        while(al>=0||bl>=0||temp!=0)
        {
            int num1 = (al>=0)?a[al]:0;
            int num2 = (bl>=0)?b[bl]:0;
            c[cl] = (num1 + num2 + temp)%10;
            temp = (num1 + num2 + temp)/10;
            al--;
            bl--;
            cl--;
        }
        int start = 0;
        if(c[start] == 0)
        {
            start = 1;
        }
        for(int i = start;i<c.length;i++)
        {
            System.out.print(c[i]+ " ");
        }
    }
}

/*Program to print the below format
+===+===+
| | |
| | |
| | |
+===+===+
| | |
| | |
| | |
+===+===+*/
class Prog59
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = java.nextInt();
        for(int i = 0;i<=n;i++)
        {
            if(i%4==0)
            {
                System.out.println("+===+===+");
            }
            else
            {
                System.out.println("| | |");
            }
        }
    }
}

/*Program  to save the string "WELCOMETOZOHOCORPORATION" in a two dimensional array and search for substring
"too" in the two dimensional string both from left to right and from top to bottom
W E L C O
M E T O Z
O H O C O
R P O R A
T I O N */
class Prog60
{
    public static void main(String[]args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = java.nextLine();
        str = str.replaceAll(" ", "");

        int ind = 0;
        int size = (int)Math.ceil(Math.sqrt(str.length()));
        char[][]mat = new char[size][size];

        for(int i = 0;i<mat.length && ind<str.length();i++)
        {
            for(int j = 0;j<mat[0].length && ind<str.length();j++)
            {
                mat[i][j] = str.charAt(ind++);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the word to search: ");
        String word = java.nextLine();

        //for the row search
        for(int i = 0;i<mat.length;i++)
        {
            StringBuilder rowchk = new StringBuilder();
            for(int j = 0;j<mat[0].length;j++)
            {
                rowchk.append(mat[i][j]);
            }
            if(rowchk.toString().contains(word))
            {
                int pos = rowchk.indexOf(word);
                System.out.println("The word present from ("+ i + ", " + pos +") to ("+ i + ", " + (pos + word.length() -1) + ") in the row");
                break;
            }
        }

        //for the column search
        for(int j = 0;j<mat[0].length;j++)
        {
            StringBuilder colchk = new StringBuilder();
            for(int i = 0;i<mat.length;i++)
            {
                colchk.append(mat[i][j]);
            }
            if(colchk.toString().contains(word))
            {
                int pos = colchk.indexOf(word);
                System.out.println("The word present from (" + pos + ", " + j +") to (" + (pos + word.length() -1) + ", " + j + ") in the column");
                break;
            }
        }
    }
}
