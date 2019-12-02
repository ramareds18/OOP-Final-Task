/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MY PC
 */
public class SuratMakiyyah extends SurahQuran {
    private String artiNamaSurat;
    private int jumlahAyat;

    public SuratMakiyyah(String idSurat, String namaSurat, String artiNamaSurat, int jumlahAyat) {
        super(idSurat, namaSurat);
        setArtiNamaSurat(artiNamaSurat);
        setJumlahAyat(jumlahAyat);
    }

    public String getArtiNamaSurat() {
        return artiNamaSurat;
    }

    public void setArtiNamaSurat(String artiNamaSurat) {
        this.artiNamaSurat = artiNamaSurat;
    }

    public int getJumlahAyat() {
        return jumlahAyat;
    }

    public void setJumlahAyat(int jumlahAyat) {
        this.jumlahAyat = jumlahAyat;
    }
    
    public String toString() {
        return super.getNamaSurat() + " (" + getArtiNamaSurat() + ") " + getJumlahAyat() + " ayat";
    }
    
}
