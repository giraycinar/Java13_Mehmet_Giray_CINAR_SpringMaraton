package com.giray.repository;

import com.giray.entity.Doktor;
import com.giray.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RandevuRepository extends JpaRepository<Randevu,Long> {

//    List<Randevu> findByDoktor(Doktor doktor);

}
