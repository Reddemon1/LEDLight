package com.example.ledlight.repository;

import com.example.ledlight.entity.Led;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LedRepository extends JpaRepository<Led,Long> {
}
