package com.giray.mapper;

import com.giray.dto.Request.DoktorAddRequestDto;
import com.giray.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {
    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    Doktor fromDoktorRequestDto(final DoktorAddRequestDto dto);
}
