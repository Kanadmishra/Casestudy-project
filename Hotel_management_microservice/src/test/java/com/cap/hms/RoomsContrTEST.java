package com.cap.hms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import com.cap.hms.controller.Addguestcontroller;
import com.cap.hms.controller.Roomscontroller;
import com.cap.hms.entity.Rooms;
import com.cap.hms.repository.Roomrepository;


import java.util.stream.Stream;
import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@WebMvcTest(Roomscontroller.class)
public class RoomsContrTEST {

    @MockBean
    private Roomrepository repository;

    @Test
    public void getRooms()  {
        when(repository.findAll()).thenReturn(Stream.of(
                new Rooms (555,"Deluxe", "Sunset",5,4000,"Available"),
                new Rooms (556,"Family Deluxe", "Lake",2,3000,"Available"))
                .collect(Collectors.toList()));
        assertEquals(2,repository.findAll().size());
    }

    @Test
    public void getRoom() {
        Rooms rooms =new Rooms(556,"Family Deluxe", "Lake",2,3000,"Available");
        repository.findById(556);
        verify(repository,times(1)).findById(556);
    }

    @Test
    public void addRoom() {
        Rooms rooms =new Rooms(615,"Suite", "Sunset",2,1200,"Available");
        when(repository.save(rooms)).thenReturn(rooms);
        assertEquals(rooms,repository.save(rooms));

    }
  @Test
    public void deleteRoom() {
        Rooms rooms =new Rooms(555,"Deluxe", "Sunset",5,4000,"Available");
        repository.deleteById(555);
        verify(repository,times(1)).deleteById(555);
    }
}
