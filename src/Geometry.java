class VolumeTabung {
    double jari2; 
    double tinggi; 
    double pi = Math.PI;

    VolumeTabung(){
        this.jari2 = this.tinggi = 1; 
    }

    void hasil() {
        System.out.println("Volume tabung dari jari jari: " + String.format("%.2f", kalkulasi()));
    }

    double kalkulasi() {
        return pi * Math.pow(jari2, 2) * tinggi;
    }
}

class LuasPersegi{
    double panjang, lebar; 

    LuasPersegi(){ // Konstruktor
        this.panjang = this.lebar = 1; 
    }

    void hasil(){
        // rumus luas persegi = Panjnag x lebar
        System.out.println("Luas dari persegi panjang: " + String.format("%.2f", (panjang * lebar)));
    }
}

class  LuasTrapesium{
    double alasAtas, alasBawah, tinggi;

    LuasTrapesium(){// konstruktor
        this.alasAtas = this.alasBawah = this.tinggi = 0; 
    }

    void hasil(){
        System.out.println("Luas dari trapesium: " + String.format("%.2f", kalkulasi()));
    }

    double kalkulasi(){
        // rumus hitung luas trapesium = ((a+b)×t​)/2
        return ((alasAtas + alasBawah) * tinggi) / 2; 
    }
}

public class Geometry 
{
    public static void main(String[] args) {
        luasIsiTabung();
        luasPersegiPanjang();
        luasTrapesium();
    }

    static void luasIsiTabung(){
        VolumeTabung obj = new VolumeTabung(); 
        obj.jari2 = 2; 
        obj.tinggi = 10; 
        obj.hasil(); 
    }

    static void luasPersegiPanjang(){
        LuasPersegi obj = new LuasPersegi();
        obj.panjang = 5; 
        obj.lebar = 10; 
        obj.hasil();
    }

    static void luasTrapesium(){
        LuasTrapesium obj = new LuasTrapesium(); 
        obj.alasAtas = 7; 
        obj.alasBawah = 10; 
        obj.tinggi = 10; 
        obj.hasil();
    }
}
