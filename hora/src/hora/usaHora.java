package hora;

public class usaHora {
    public static void main(String[] args) {
        hora h=new hora();
        //h.incrementa();
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.setSegon(1);
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.setMinut(45);
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.setHora(4);
        //h.incrementa();
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());



        h.decrementa(5);
        h.seguent(5);
       System.out.println (h.toString());
    }
}
