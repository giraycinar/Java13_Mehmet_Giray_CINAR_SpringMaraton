package com.giray.dto.Response;

import com.giray.entity.views.VwDoktor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoktorGetAllResponseDto {
    VwDoktor doktor;
    List<VwDoktor> doktorlar;
}
