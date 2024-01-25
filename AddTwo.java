public class AddTwo {
    public static void main(String[] args) {
            // קליטת ערכים לתוך משתנים
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
            //חיבור ערכים
        int c=a+b;
            //הדפסת הערכים
        System.out.println(args[0] + " + " + args[1] + " = " + c);
    }   
}