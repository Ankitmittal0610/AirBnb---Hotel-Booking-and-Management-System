package com.ankit.projects.airBnbApp.service;

import com.ankit.projects.airBnbApp.dto.HotelDto;
import com.ankit.projects.airBnbApp.dto.HotelSearchRequest;
import com.ankit.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
