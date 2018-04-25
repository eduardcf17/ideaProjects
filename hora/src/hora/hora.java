package hora;

public class hora {
    private int hora;
    private int minut;
    private int segon;

    public int getHora() {
        return hora;
    }

    public int getMinut() {
        return minut;
    }

    public void setHora(int hora) {
        if(hora>0){
        this.hora = hora;
        }else{System.out.println("No acepta negativos");}
    }

    public void setMinut(int minut) {
        if(minut<60&&minut>0){
        this.minut = minut;
        }
    }

    public void setSegon(int segon) {
        this.segon = segon;
    }

    public int getSegon() {
        return segon;
    }

    public hora(){
        hora=0;
        minut=0;
        segon=0;
    }
    public hora(int hora,int minut, int segon){
        if(hora>0&&minut<60&&minut>0&&segon<60&&segon>0){
            setHora(hora);
            setMinut(minut);
            setSegon(segon);
        }
    }
    public void  seguent(int sumar){
        int i;
        for(i=0;i<sumar;i++){
            incrementa();
        }
    }
    public void incrementa(){
        if(this.segon+1<59){
            this.segon=this.segon+1;
        }else{
            this.segon=0;
            if(this.minut+1<59){
                this.minut=this.minut+1;
            }else{
                this.minut=0;
                this.hora=this.hora+1;
            }
        }
    }
    public void decremeta(){
        if(this.segon-1<=59&&this.segon!=0){
            this.segon=this.segon-1;
        }else{
            if(this.minut>0){
                this.minut=this.minut-1;
                this.segon=this.segon+59;
            }else{
                if(this.hora>0){
                    this.hora=this.hora-1;
                    this.minut=59;
                    this.segon=59;
                }

            }

        }
    }
    public void decrementa(int segons){
        int i;
        for(i=0;i<segons;i++){
            decremeta();
        }
    }
    public String toString(){
         return String.format("%d:%02d:%02d\n",this.hora,this.minut,this.segon);
    }
}

