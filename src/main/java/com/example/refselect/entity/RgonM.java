package com.example.refselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RGON_M")
public class RgonM {
    @Id
    @Column(name = "RGON_CD", length = 2, nullable = false)
    private String rgonCd;

    @Column(name = "RGON_NM", length = 40, nullable = false)
    private String rgonNm;

    @Column(name = "RGON_USE_TYP", length = 1, nullable = false)
    private String rgonUseTyp;

    @Column(name = "DISP_ORDER", nullable = false)
    private Integer dispOrder;

    @Column(name = "DELETE_FLG", length = 1, nullable = false)
    private String deleteFlg;

    public String getRgonCd() {
        return rgonCd;
    }

    public void setRgonCd(String rgonCd) {
        this.rgonCd = rgonCd;
    }

    public String getRgonNm() {
        return rgonNm;
    }

    public void setRgonNm(String rgonNm) {
        this.rgonNm = rgonNm;
    }

    public String getRgonUseTyp() {
        return rgonUseTyp;
    }

    public void setRgonUseTyp(String rgonUseTyp) {
        this.rgonUseTyp = rgonUseTyp;
    }

    public Integer getDispOrder() {
        return dispOrder;
    }

    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}
