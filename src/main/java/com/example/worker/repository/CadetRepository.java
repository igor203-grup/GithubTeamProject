package com.example.worker.repository;

import com.example.worker.model.Cadet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CadetRepository extends JpaRepository<Cadet, Long> {
}
