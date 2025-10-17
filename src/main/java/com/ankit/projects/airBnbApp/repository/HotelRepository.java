package com.ankit.projects.airBnbApp.repository;

import com.ankit.projects.airBnbApp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //No need to add @Repository here bcoz its a interface we cant create bean of i/f and it extends from JPA repository
// which has a concrete class SimpleJpaRepository. so need to add here.
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
