public class Hora {
    private int h, m, s;
    public Hora()                   { h=0; m=0; s=0;                }
    public Hora(int h,int m, int s) { this.h=h; this.m=m; this.s=s; }
    public int getHora()            { return h;                     }
    public int getMinut()           { return m;                     }
    public int getSegon()           { return s;                     }
    public void setHora(int h)      {
        if(h>=0){
            this.h=h;
        }else{
            throw  new ForaIntervalException("El valor introducido en hora no es valido");
        }
    }
    public void setMinut(int m)     {
        if(m<60 && m>=0){
        this.m=m;
        }else{
            throw  new ForaIntervalException("El valor introducido en minutos no es valido");
        }
    }
    public void setSegon(int s)     {
        if(m<60 && m>0){
        this.s=s;}else{
            throw  new ForaIntervalException("El valor introducido en segundos no es valido");
        }                     }
    public String toString()        { return h+":"+m+":"+s;         }
}