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
    }
}
