public class CTestEmpleat {
    public static void main(String[] args) {
        CEmpleat alguien = new CEmpleat("nom","p","p2","alguo",2,2018,2500,"a");
        alguien.incrementa(50,alguien.getNombreFills());
        System.out.println(alguien.getNom()+" "+alguien.getSalari());
    CEmpleat segonEmpleat =new CEmpleat("segonEMpleat","p","p2","alguo",3,2018,2500,"a");;
    CEmpleat copia=segonEmpleat.copia();
    copia.setNombreFills(0);
    copia.incrementa(10);
    segonEmpleat.incrementa(10);
    System.out.println(copia.getNombreFills()+" "+copia.getSalari());
    System.out.println(segonEmpleat.getNombreFills()+" "+segonEmpleat.getSalari());
    System.out.println(copia.toString());
    System.out.println(segonEmpleat.toString());

    }
}
