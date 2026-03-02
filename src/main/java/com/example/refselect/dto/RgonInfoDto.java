package com.example.refselect.dto;

public class RgonInfoDto {
    private String rgonCd;
    private String rgonNm;

    public RgonInfoDto() {
    }

    public RgonInfoDto(String rgonCd, String rgonNm) {
        this.rgonCd = rgonCd;
        this.rgonNm = rgonNm;
    }

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
}
