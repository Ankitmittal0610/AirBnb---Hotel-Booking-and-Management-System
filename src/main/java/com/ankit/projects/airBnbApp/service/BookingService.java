package com.ankit.projects.airBnbApp.service;

import com.ankit.projects.airBnbApp.dto.BookingDto;
import com.ankit.projects.airBnbApp.dto.BookingRequest;
import com.ankit.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
