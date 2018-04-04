package praktek003;
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu o = new Sepatu();
        o.merk      = "Nike";
        o.warna     = "Hitam Putih";
        o.desain    = "Sporty";
        o.kualitas  = "Original Premium";
        o.harga     = 1500000;
    
        o.cetakInfo();
    }
}
