package com.Sereniquedev.SereniqueHotel.service.interfac;

import com.Sereniquedev.SereniqueHotel.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public interface IRoomService {

    Response addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice,String description);

    List<String> getAllRoomTypes;

    Response getAllRooms();
}
