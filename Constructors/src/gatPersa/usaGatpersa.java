package gatPersa;

public class usaGatpersa {
    public static void main(String[] args) {
        GatPersa renat = new GatPersa();
        GatPersa hblador = new GatPersa(true);
        System.out.println("Al Renat li queden " + renat.getVides() + " vides");
        GatPersa megaRenat = new GatPersa(12);
        System.out.println("A Mega Renat li queden " + megaRenat.getVides() + " vides");
    }


}
