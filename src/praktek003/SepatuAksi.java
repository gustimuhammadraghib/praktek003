package praktek003;
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu o = new Sepatu();
        o.setMerk     ("Adidas");
        o.setWarna    ("Turbo Red Putih");
        o.setDesain   ("Casual");
        o.setKualitas ("Original");
        o.setHarga    (2000000);
    
        o.cetakInfo();
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Merknya        \t: ");
        System.out.println(o.getMerk());
        System.out.println("Warnanya       \t: ");
        System.out.println(o.getWarna());
        System.out.println("Desainnya      \t: ");
        System.out.println(o.getDesain());
        System.out.println("Kualitasnya    \t: ");
        System.out.println(o.getKualitas());
        System.out.println("Harganya       \t: ");
        System.out.println(o.getHarga());
    }
}
