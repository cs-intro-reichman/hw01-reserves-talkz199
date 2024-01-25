public class Coins {
    public static void main(String[] args){

        int Nq = (Integer.parseInt(args[0])) / 25 ;
        int Nc = (Integer.parseInt(args[0])) % 25 ;
    
    
        System.out.println(" Use " + Nq + " qearters and " + Nc + " cents ");
    }
}