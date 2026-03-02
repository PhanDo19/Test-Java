package com.example.refselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "REF_M")
public class RefM {
    @Id
    @Column(name = "REF_CD", length = 10, nullable = false)
    private String refCd;

    @Column(name = "REF_NM", length = 100, nullable = false)
    private String refNm;

    @Column(name = "REF_KN", length = 200, nullable = false)
    private String refKn;

    @Column(name = "TEL_NO", length = 13)
    private String telNo;

    @Column(name = "PREF_CD", length = 2)
    private String prefCd;

    @Column(name = "RGON_CD", length = 2)
    private String rgonCd;

    @Column(name = "DELETE_FLG", length = 1, nullable = false)
    private String deleteFlg;

    public String getRefCd() {
        return refCd;
    }

    public void setRefCd(String refCd) {
        this.refCd = refCd;
    }

    public String getRefNm() {
        return refNm;
    }

    public void setRefNm(String refNm) {
        this.refNm = refNm;
    }

    public String getRefKn() {
        return refKn;
    }

    public void setRefKn(String refKn) {
        this.refKn = refKn;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getPrefCd() {
        return prefCd;
    }

    public void setPrefCd(String prefCd) {
        this.prefCd = prefCd;
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
