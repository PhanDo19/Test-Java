package com.example.refselect.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.refselect.dto.LoadOutDto;
import com.example.refselect.dto.RefLoadFormDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class RefSelectServiceTest {

    @Autowired
    private RefSelectService service;

    @Test
    void loadRefSelect_returnsOrderedRegionsAndHtml() {
        LoadOutDto out = service.loadRefSelect(new RefLoadFormDto(1));

        assertThat(out.getRgonInfoDto()).isNotEmpty();
        assertThat(out.getRgonInfoDto().get(0).getRgonCd()).isEqualTo("01");
        assertThat(out.getRgonInfoDto().get(out.getRgonInfoDto().size() - 1).getRgonCd()).isEqualTo("99");

        String html = out.getRefSelectHTML();
        assertThat(html).contains("問合せ先一括選択");
        assertThat(html).contains("value=\"99\"");
        assertThat(html).doesNotContain("value=\"99\" checked");
        assertThat(html).doesNotContain("value=\"99\" checked=\"checked\"");
    }
}
