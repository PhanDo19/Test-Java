package com.example.refselect.dto;

import java.util.List;

public class LoadOutDto extends CommonResultDto {
    private List<RgonInfoDto> rgonInfoDto;
    private String refSelectHTML;

    public List<RgonInfoDto> getRgonInfoDto() {
        return rgonInfoDto;
    }

    public void setRgonInfoDto(List<RgonInfoDto> rgonInfoDto) {
        this.rgonInfoDto = rgonInfoDto;
    }

    public String getRefSelectHTML() {
        return refSelectHTML;
    }

    public void setRefSelectHTML(String refSelectHTML) {
        this.refSelectHTML = refSelectHTML;
    }
}
