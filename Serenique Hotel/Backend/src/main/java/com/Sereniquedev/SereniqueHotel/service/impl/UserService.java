package com.Sereniquedev.SereniqueHotel.service.impl;

import com.Sereniquedev.SereniqueHotel.dto.LoginRequest;
import com.Sereniquedev.SereniqueHotel.dto.Response;
import com.Sereniquedev.SereniqueHotel.entity.User;
import com.Sereniquedev.SereniqueHotel.repo.UserRepository;
import com.Sereniquedev.SereniqueHotel.service.interfac.IUserService;
import com.Sereniquedev.SereniqueHotel.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JWTUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Response register(User loginRequest) {
        return null;
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public Response getUserBookingHistory(String userId) {
        return null;
    }

    @Override
    public Response deleteUser(String userId) {
        return null;
    }

    @Override
    public Response getUserById(String userId) {
        return null;
    }

    @Override
    public Response getMyInfo(String userId) {
        return null;
    }
}
