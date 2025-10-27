package com.ankit.projects.airBnbApp.service;

import com.ankit.projects.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);
}
