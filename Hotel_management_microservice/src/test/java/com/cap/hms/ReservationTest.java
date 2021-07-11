package com.cap.hms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import com.cap.hms.controller.Addguestcontroller;
import com.cap.hms.controller.ReservationController;
import com.cap.hms.entity.Reservation;
import com.cap.hms.repository.ReservationRepository;
import java.util.*;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@WebMvcTest(ReservationController.class)
public class ReservationTest {

    @MockBean
    private ReservationRepository repository;

    @Test
    public void getReservations()  {
        when(repository.findAll()).thenReturn(Stream.of(
                new Reservation (111,2, 2, 989732641 ,"Monday","Tuesday", "Lake side"),
                new Reservation (112,4, 2, 889831025 , "friday","monday", "Balcony"))
                .collect(Collectors.toList()));
        assertEquals(2,repository.findAll().size());
    }

    @Test
    public void getreservation() {
    	
        Reservation reservation =new Reservation(111,2, 2, 989732641 , "Monday","Tuesday", "Lake side");
        System.out.println(reservation);
        repository.findById(111);
        verify(repository,times(1)).findById(111);
    }

    @Test
    public void saveReservation() {
        Reservation reservation =new Reservation(115,2, 2, 632598451 , "Friday","Tuesday", "Sunset");
        when(repository.save(reservation)).thenReturn(reservation);
        assertEquals(reservation,repository.save(reservation));

    }
  @Test
    public void deleteReservation() {
        Reservation reservation =new Reservation(112,4, 2, 889831025 , "friday","monday", "Balcony");
        repository.deleteById(112);
        verify(repository,times(1)).deleteById(112);
        
    }
}



