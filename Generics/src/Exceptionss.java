public class Exceptionss {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        try{
            int c = a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always run");
        }
    }
    


}
