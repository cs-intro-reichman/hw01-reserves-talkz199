public class GenThree{
    public static void main(String[] args){
// הגדרת התחום הרצצוי לעבודה
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

int x1 = (int)(a + Math.random()* (b - a));
int x2 = (int)(a + Math.random()* (b - a));
int x3 = (int)(a + Math.random()* (b - a));
//הדפסת הערכים הרנדומליים
System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
// בדיקה מה המספר המינימלי והדפסה שלו
System.out.println( "The minimal generated number was " + Math.min(x1,Math.min(x2,x3)));

    }
}

