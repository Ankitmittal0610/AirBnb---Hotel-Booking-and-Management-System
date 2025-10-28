package com.ankit.projects.airBnbApp.service;

import com.ankit.projects.airBnbApp.dto.HotelDto;
import com.ankit.projects.airBnbApp.dto.HotelInfoDto;
import com.ankit.projects.airBnbApp.dto.HotelInfoRequestDto;

import java.util.List;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
