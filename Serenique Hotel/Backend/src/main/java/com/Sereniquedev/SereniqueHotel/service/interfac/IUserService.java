package com.Sereniquedev.SereniqueHotel.service.interfac;

import com.Sereniquedev.SereniqueHotel.dto.LoginRequest;
import com.Sereniquedev.SereniqueHotel.dto.Response;
import com.Sereniquedev.SereniqueHotel.entity.User;

public interface IUserService {

    Response register(User loginRequest);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String userId);
}
