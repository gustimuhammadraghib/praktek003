package praktek003;

public class SepatuSandal extends Sepatu{
    private String bahan;
    
    void throttle(){
        System.out.println("------Terima Kasih------");
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    
}
