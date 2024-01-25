public class LinearEp {
    public static void main(String[] args){
        //הכנסת ערכים למשותנים
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
        // חישוב הנוסחה
    double x  = (( c - b )/ a) ;
        //הדפסת הנוסחה והפתרון    
 System.out.println( a + " * x +" + b + " = " + c );
 System.out.println("x = " + x );;
    }
}
