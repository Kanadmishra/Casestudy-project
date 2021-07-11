package com.cap.hms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import com.cap.hms.controller.Addguestcontroller;
import com.cap.hms.controller.staffcontroller;
import com.cap.hms.entity.staff;
import com.cap.hms.repository.staffrepository;
import java.util.stream.Stream;
import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



@WebMvcTest(staffcontroller.class)
public class StaffcontroTEST {

    @MockBean
    private staffrepository repository;

    @Test
    public void getstaff()  {
        when(repository.findAll()).thenReturn(Stream.of(
                new staff(999,"Rohit","New Delhi",25000,23,"Manager","Rohit@gmail.com"),
                new staff(888,"Sushil","Agra",15000,25,"Cleaner","Sushil@gmail.com"))
                .collect(Collectors.toList()));
        assertEquals(2,repository.findAll().size());
    }

    @Test
    public void getRoom() {
        staff staff =new staff(999,"Rohit","New Delhi",25000,23,"Manager","Rohit@gmail.com");
        repository.findById(999);
        verify(repository,times(1)).findById(999);
    }

    @Test
    public void addstaff() {
        staff staff =new staff(444,"Rittik","Meerut",26000,23,"Manager","Rittik@gmail.com");
        when(repository.save(staff)).thenReturn(staff);
        assertEquals(staff,repository.save(staff));

    }
  @Test
    public void deletestaff() {
        staff staff =new staff(888,"Sushil","Agra",15000,25,"Cleaner","Sushil@gmail.com");
       repository.deleteById(888);
        verify(repository,times(1)).deleteById(888);
    }
}



