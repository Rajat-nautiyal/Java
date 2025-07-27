package DSA;
import java.util.Scanner;

public class Pattern {
    public static void patt1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("* "); //print() prints horizontally
            }
            System.out.println();//starts with next line
        }
    }
    public static void patt2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patt3(int n){
        for(int i = 1; i<n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void patt4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
            
        }
    }
    public static void patt5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*" );
            }
            System.out.println();
            
        }
    }
    public static void patt6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    }
    public static void patt7(int n){
        for(int i = 1; i <= n; i++){
            for(int s = 0; s < n-i; s++){
                System.err.print("s");
            }
            for(int m = 0; m < 2*i - 1; m++){
                System.out.print("*");
            }
            for(int k = 0; k < n-i; k++){
                System.err.print("s");
            }
            System.out.println();
        }
    }
    public static void patt8(int n){
        for(int i = n; i >= 1; i--){
            for(int s = 0; s < n-i; s++){
                System.err.print("s");
            }
            for(int m = 0; m < 2*i - 1; m++){
                System.out.print("*");
            }
            for(int k = 0; k < n-i; k++){
                System.err.print("s");
            }
            System.out.println();
        }
    }
    public static void patt9(int n){
        patt7(n);
        patt8(n);
    }
    public static void patt10(int n){
        for(int i = 0; i<2*n-1; i++){
            if(i<=n-1){
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int k = 0; k < 2*n - i ; k++){
                    System.out.print("*");
                }
                System.out.println();    
            }
        }
    }
    public static void patt11(int n){
        for(int i = 0; i < n; i++){
            int start;
             if(i%2 == 0) start = 1;
             else start = 0;
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start =  1 - start;
            }
            System.out.println();
        }
    }
    public static void patt12(int n){
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int s = 1; s <= 2*n - 2*i; s++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print(i-k);
            }
            System.out.println();
        }
    }
    public static void patt13(int n){
        int k = 1;
        for(int i=0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    public static void patt14(int n){
        for(int i = 0; i<n; i++){
            for(char c = 'A'; c<='A'+i; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void patt15(int n){
        for(int i = 0; i<n; i++){
            for(char c = 'A'; c<='A'+n-i-1; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
   public static void patt16(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                char c = 'A';
                System.out.print((char)(c+i)); //type casted to char
            }
            System.out.println();
        }
    }
    public static void patt17(int n){
        for(int i = 0; i<n; i++){
            for(char c = 'A'; c<='A'+i; c++){
                System.out.print(c);
            }
            for(char k = (char) ((char)'A'+i-1); k>='A'; k--){
                if(i == 0) break;
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void patt18(int n){
        for(int i = 0; i<n; i++){
            for(char c = (char) ('A'+n-i-1); c <='A'+n -1; c++ ){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void patt20(int n){
        for(int i = 1; i<=2*n -1; i++){
            if(i <= 2*n - i){
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                for(int s = 2*n - 2*i -1; s>=1; s-- ){
                    System.out.print("s");
                }
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.err.println();
            }else{
                for(int j = 1; j<=2*n - i; j++){
                    System.out.print("*");
                }
                for(int s = 1; s<=2*i-2*n-1; s++){
                    System.out.print("s");
                }
                for(int j = 1; j<=2*n - i; j++){
                    System.out.print("*");
                }       
                System.err.println();
            }
        }
    }

    public static void patt21(int n){
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if((i!=0 && i!=n-1) && (j!=0 && j!=n-1)){
                    System.out.print("s");
                }else{
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size");
        int x = scanner.nextInt();
        patt21(x);
    }
}
