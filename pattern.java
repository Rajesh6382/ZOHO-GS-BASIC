class pattern{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 

* * * * 
* * * *
* * * *
* * * *

*/

class pattern1{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 

* 
* *
* * *
* * * *

*/

class pattern2{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 

* * * * 
* * *
* *
*

*/


class pattern3{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
/*

* * * * 
* * *
* *
*

*/

