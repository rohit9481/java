public class basic {
        public static void main(String[] args){
            func(5);
            System.out.println(".............");
            func1(5);
        }
        static void func(int n){
            if(n == 0){
                return;
            }
            System.out.println(n);
            func(n-1);
        }
        static void func1(int n){
            if(n == 0){
                return;
            }
            func1(n - 1);
            System.out.println(n);
        }

    }

