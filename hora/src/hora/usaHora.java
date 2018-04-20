package hora;

public class usaHora {
    public static void main(String[] args) {
        hora h=new hora();
        h.incrementa();
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.setSegon(59);
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.setMinut(59);
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.incrementa();
        //System.out.println(h.getHora()+":"+h.getMinut()+":"+h.getSegon());
        h.toString();
    }
}
