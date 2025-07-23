package com.Sereniquedev.SereniqueHotel.security;

import com.Sereniquedev.SereniqueHotel.utils.JWTUtils;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.CachingUserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {

    @Autowired
    private JWTUtils jwtUtils;

    @Autowired
    private CachingUserDetailsService cachingUserDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        final String authHeader=request.getHeader("Authorization");
        final String jwtToken;
        final String userEmail;

        if(authHeader==null || authHeader.isBlank()){
            filterChain.doFilter(request,response);
            return;
        }

        jwtToken=authHeader.substring(7);
    }
}