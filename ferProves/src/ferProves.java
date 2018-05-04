public class ferProves {
    public static void main(String[] args) {
        // Proves apartat 3
        Vehicle prova1 = new Vehicle();//prova vehicle vuit
        System.out.println(prova1.toString());//comprova els valors per defecte. Prova apartat 4
        Vehicle prova2=new Vehicle("123456",2);
        System.out.println(prova2.toString());//prova apartat 4
        // Proves apartat 4
        prova1.setMatricula("aaaaaaaaaa");//comproba que el set detecti l'error
        prova1.setMatricula("aaaaaa");//comproba que deixa les corectes
        prova1.setAntiguitat(-5);
        prova1.setAntiguitat(5);
        prova1.getAntiguitat();
        // Proves apartat 5
        Vehicle.utilitari ut1= new Vehicle.utilitari();
        ut1.setVelocitatMax((float) 6.8);
        ut1.setVelocitatMax((float) -6.8);
        // Proves apartat 6
        ut1.setMatricula("a67900");
        ut1.toString();
        //// Proves apartat 7







    }
}
