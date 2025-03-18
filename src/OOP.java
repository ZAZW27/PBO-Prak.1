class VolumeTabung{
    double jari2; 
    double tinggi; 
    double pi;

    VolumeTabung(){
        this.jari2 = this.tinggi = 1; 
        pi = Math.PI; 
    }

    void hasil() {
        System.out.println("Volume tabung r="+ this.jari2 + " dan t=" + tinggi + ". Adalah: "  + String.format("%.2f", kalkulasi()));
    }

    double kalkulasi() {
        return pi * Math.pow(jari2, 2) * tinggi;
    }
}

public class OOP {
    public static void main(String[] args){
        VolumeTabung tabung1 = new VolumeTabung(); 
        tabung1.jari2 = 2; 
        tabung1.tinggi = 5; 

        VolumeTabung tabung2 = new VolumeTabung(); 
        tabung2.jari2 = 5; 
        tabung2.tinggi = 7; 

        tabung1.hasil();
        tabung2.hasil();
    }
}
