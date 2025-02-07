import java.util.Scanner;
public class max_min {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int first =in.nextInt();

        System.out.println("Enter the second: ");
        int second = in.nextInt();

        System.out.println("Enter the third: ");
        int third = in.nextInt();

        int largest= largest(first,second,third);
        int smallest= smallest(first,second,third);

        System.out.println("largest: "+largest);
        System.out.println("smallest: "+smallest);
    }

    public static int largest(int first,int second,int third){
        int max =first;
        if(second> max){
            max= second;
        }
        if (third>max){
            max= third;
        }
        return max;
    }

    public static int smallest(int first,int second,int third){
        int min =first;
        if(second< min){
            min= second;
        }
        if (third<min){
            min= third;
        }
        return min;
    }
}
