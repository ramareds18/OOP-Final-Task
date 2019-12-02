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
public abstract class SurahQuran {
    private String idSurat;
    private String namaSurat;
    
    public SurahQuran(String idSurat, String namaSurat) {
        this.idSurat = idSurat;
        this.namaSurat = namaSurat;
    }

    public String getIdSurat() {
        return idSurat;
    }

    public void setIdSurat(String idSurat) {
        this.idSurat = idSurat;
    }

    public String getNamaSurat() {
        return namaSurat;
    }

    public void setNamaSurat(String namaSurat) {
        this.namaSurat = namaSurat;
    }
    
}
