package com.example.refselect.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "URL_M")
public class UrlM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "URL_ID")
    private Long urlId;

    @Column(name = "REF_CD", length = 10, nullable = false)
    private String refCd;

    @Column(name = "URL_ADDR", length = 256, nullable = false)
    private String urlAddr;

    @Column(name = "DELETE_FLG", length = 1, nullable = false)
    private String deleteFlg;

    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public String getRefCd() {
        return refCd;
    }

    public void setRefCd(String refCd) {
        this.refCd = refCd;
    }

    public String getUrlAddr() {
        return urlAddr;
    }

    public void setUrlAddr(String urlAddr) {
        this.urlAddr = urlAddr;
    }

    public String getDeleteFlg() {
        return deleteFlg;
    }

    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}
