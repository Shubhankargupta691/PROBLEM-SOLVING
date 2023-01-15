import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter the number to find binary || octal");
            int n = sc.nextInt();

        System.out.println("enter  your choice press 1 for dectoBinARY AND 2 for dectoOctal");
         ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("dectoBinARY");
                dectoBinary(n);
                    break;
            case 2:
                System.out.println("dectoOctal");
                decitoOct(n);
                    break;
        }

    }
    static void dectoBinary(int n) {

        int [] binary = new int[32];
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1; j>=0;j--){
            System.out.println(binary[j]);
        }

    }

    static void decitoOct(int m) {
        int [] Octal = new int [32];
            int i=0,j;
                while(m>0){
                    Octal[i] = m%8;
                        m=m/8;
                        i++;
                }
        for(j=i-1;j>=0;j--){
            System.out.println(Octal[j]);
        }

    }
            }
