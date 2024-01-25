public class Triangle {
   public static void main(String[] args) {
   // הגדרת צלעות המשולש כמשתנים והכנסת ערך
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    //בדיקת אי שוויון המשולש והדפסת התשובה 
    if((a+b)>c && (b+c)>a && (a+c)>c ) {
        System.out.println(a + "," + b + "," +  c + ": true");
    }
else {
    System.out.println(a + "," + b + "," +  c + ": false");
    } 
 } 
}
