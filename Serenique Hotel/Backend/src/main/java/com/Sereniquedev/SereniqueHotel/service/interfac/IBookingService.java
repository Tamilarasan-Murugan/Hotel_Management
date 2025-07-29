package com.Sereniquedev.SereniqueHotel.service.interfac;

import com.Sereniquedev.SereniqueHotel.dto.Response;
import com.Sereniquedev.SereniqueHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
