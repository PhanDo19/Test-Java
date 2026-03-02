package com.example.refselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PREF_M")
public class PrefM {
    @Id
    @Column(name = "PREF_CD", length = 2, nullable = false)
    private String prefCd;

    @Column(name = "PREF_NM", length = 40, nullable = false)
    private String prefNm;

    @Column(name = "RGON_CD", length = 2)
    private String rgonCd;

    @Column(name = "DELETE_FLG", length = 1, nullable = false)
    private String deleteFlg;

    public String getPrefCd() {
        return prefCd;
    }

    public void setPrefCd(String prefCd) {
        this.prefCd = prefCd;
    }

    public String getPrefNm() {
        return prefNm;
    }

    public void setPrefNm(String prefNm) {
        this.prefNm = prefNm;
    }

    public String getRgonCd() {
        return rgonCd;
    }

    public void setRgonCd(String rgonCd) {
        this.rgonCd = rgonCd;
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}
