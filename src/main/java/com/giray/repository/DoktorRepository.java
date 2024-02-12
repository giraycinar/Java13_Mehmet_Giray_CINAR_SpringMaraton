package com.giray.repository;

import com.giray.dto.Request.DoktorAddRequestDto;
import com.giray.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoktorRepository extends JpaRepository<Doktor,Long> {

}
