public class App {
    public static void main(String[] args) throws Exception {
       int num = 3;
       int counter = 0;
       String res= "";
       while(counter !=100){
        res = fizzbuzz(num);
        System.out.println(res);
        counter++;
        num++;
       }
       String m = fizzbuzz(num);
       System.out.println(m);
    }
    public static String fizzbuzz(int number) {
        if((number % 5 == 0)&& (number % 3 == 0)){
            return "fizz buzz";
        }else if(number % 3 == 0){
            return "fizz";
        }else if(number % 5 == 0){
            return "buzz";
        }else{
            return Integer.toString(number);
        }
    }
}
