package uf4.EX3;

public class UsaGatPersa {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides");
        renat.setVides(-12);
        renat.setEstats("dret");
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides"+"esta "+renat.getEstat());
        renat.setVides(12);
        renat.setEstats("estirat");
        System.out.println("Al gat Renat li queden " + renat.getVides() + " vides "+"esta "+renat.getEstat());
        System.out.println("Al gat Renat esta estirat "+renat.estaEstirat() );
        System.out.println("Al gat Renat esta dret "+renat.estaDret() );
        System.out.println("Al gat Renat esta asegut "+renat.estaAssegut() );
    }

}