package com.example.refselect.dto;

public class RefLoadFormDto extends CommonScreenInDto {
    private Integer kindRef;

    public RefLoadFormDto() {
    }

    public RefLoadFormDto(Integer kindRef) {
        this.kindRef = kindRef;
    }

    public Integer getKindRef() {
        return kindRef;
    }

    public void setKindRef(Integer kindRef) {
        this.kindRef = kindRef;
    }
}
