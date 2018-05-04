public class ullGat {
    public static  String ull;

    public ullGat(){
        ullGat.ull="0";
    }

    public void obert(){
        if(ullGat.ull.equals("0")){
            ullGat.ull="1";
            System.out.print("nyeek");
        }
    }
    public void tancat(){
        if(ullGat.ull.equals("1")){
            ullGat.ull="0";
            System.out.print("plonx");
        }
    }
    public static boolean estasObert(){
        if(ullGat.ull.equals("0")){
            return false;
        }else{
            return true;
        }
    }
}
