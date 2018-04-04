package praktek003;

public class Sepatu {
  private String merk;
  private String warna;
  private String desain;
  private String kualitas;
  private double harga;
  
  void cetakInfo(){
      System.out.println("=====PRAKTEK 003=====");
      System.out.println("Merk \t        : " +merk+"\n"+
                "Warna         \t: " +warna+"\n"+
                "Desain        \t: " +desain+"\n"+
                "Kualitas      \t: " +kualitas+"\n"+
                "Harga         \t: " +harga);
  }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getDesain() {
        return desain;
    }

    public void setDesain(String desain) {
        this.desain = desain;
    }

    public String getKualitas() {
        return kualitas;
    }

    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
  
}
