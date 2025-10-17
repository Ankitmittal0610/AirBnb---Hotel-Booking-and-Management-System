package com.ankit.projects.airBnbApp.repository;

import com.ankit.projects.airBnbApp.entity.Inventory;
import com.ankit.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByRoom(Room room);
}
