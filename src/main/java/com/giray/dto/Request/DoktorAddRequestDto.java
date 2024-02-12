package com.giray.dto.Request;

import com.giray.utility.enums.EBranslar;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DoktorAddRequestDto {
    String ad;
    String soyad;
    Integer yas;
    String tel;
    String adres;
    String email;



    @Enumerated
    EBranslar branslar;
}
