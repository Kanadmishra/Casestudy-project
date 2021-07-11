package com.cap.hms;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;

import com.cap.hms.controller.Addguestcontroller;
import com.cap.hms.entity.Addguest;
import com.cap.hms.repository.AddguestRepository;
import java.util.stream.Stream;
import java.util.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.test.context.junit4.SpringRunner;

@WebMvcTest(Addguestcontroller.class)
public class AddguestTest {
	
	@MockBean
    public  AddguestRepository repository;

  

    @Test
    public  void getAddguest() {
        Addguest addguest =new Addguest(125,"Accenture","Ria", "Ria@gmail.com", "Female","Chennai", 981852859);
       repository.findById(125);
        verify(repository,times(1)).findById(125);
    }
    
    @Test
    public  void addguest() {
        Addguest addguest =new Addguest(129,"Slice","Shreya", "shreya@gmail.com", "Female","Bihar", 888019859);
        when(repository.save(addguest)).thenReturn(addguest);
        assertEquals(addguest,repository.save(addguest));

    }
    @Test
    public  void deleteGuest() {
        Addguest addguest =new Addguest(121,"Tata Namo","Tamu", "tarun123@gmail.com", "male","Mumbai", 981823369);
        repository.deleteById(121);
        verify(repository,times(1)).deleteById(121);
    }
    
    @Test
    public  void getAddguests()  {
        MongoRepository<Addguest, String> AddguestRepository;
        when(repository.findAll()).thenReturn(Stream
        		.of(new Addguest(120,"Tata","Tarun", "tarun@gmail.com", "male","New Delhi", 741852369),
                new Addguest(121,"Tata Namo","Tamu", "tarun123@gmail.com", "male","Mumbai", 981823369))
                .collect(Collectors.toList()));
        assertEquals(2,repository.findAll().size());

    }
    
    
}

