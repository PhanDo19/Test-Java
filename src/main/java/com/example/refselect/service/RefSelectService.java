package com.example.refselect.service;

import com.example.refselect.dto.LoadOutDto;
import com.example.refselect.dto.RefLoadFormDto;
import com.example.refselect.dto.RgonInfoDto;
import com.example.refselect.entity.RgonM;
import com.example.refselect.repository.RgonMRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

@Service
public class RefSelectService {
    private final RgonMRepository rgonMRepository;
    private final SpringTemplateEngine templateEngine;

    public RefSelectService(RgonMRepository rgonMRepository, SpringTemplateEngine templateEngine) {
        this.rgonMRepository = rgonMRepository;
        this.templateEngine = templateEngine;
    }

    public LoadOutDto loadRefSelect(RefLoadFormDto form) {
        List<RgonM> regions = rgonMRepository.findCoreRegions();
        List<RgonInfoDto> rgonInfos = regions.stream()
                .map(r -> new RgonInfoDto(r.getRgonCd(), r.getRgonNm()))
                .collect(Collectors.toList());

        String title = (form != null && Integer.valueOf(1).equals(form.getKindRef()))
                ? "問合せ先一括選択"
                : "問合せ先選択";

        Context context = new Context();
        context.setVariable("title", title);
        context.setVariable("rgonInfos", rgonInfos);
        context.setVariable("recordCount", 0);

        String html = templateEngine.process("ref_select", context);

        LoadOutDto out = new LoadOutDto();
        out.setRgonInfoDto(rgonInfos);
        out.setRefSelectHTML(html);
        out.setResultCode("0");
        out.setResultMessage("OK");
        return out;
    }
}
