package com.giray.controller;

import com.giray.dto.Request.DoktorAddRequestDto;
import com.giray.dto.Response.DoktorGetAllResponseDto;
import com.giray.entity.Doktor;
import com.giray.entity.Randevu;
import com.giray.repository.RandevuRepository;
import com.giray.service.DoktorService;
import com.giray.service.RandevuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.DataTruncation;
import java.util.List;
import java.util.Optional;

import static com.giray.constants.RestApiUrls.*;
@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;





    @PostMapping(ADD)
    public ResponseEntity<Void> add(@RequestBody DoktorAddRequestDto dto){
        Doktor doktor = doktorService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Doktor>> findAll() {
        return ResponseEntity.ok(doktorService.findAll());
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<Optional<Doktor>> findByDoctorId(@PathVariable Long doktorId) {
        return ResponseEntity.ok(doktorService.findById(doktorId));
    }


}
