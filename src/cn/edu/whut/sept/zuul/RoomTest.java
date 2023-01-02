package cn.edu.whut.sept.zuul;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;

class RoomTest {
    @Mock
    HashMap<String, Room> exits;
    @InjectMocks
    Room room;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testLook() {
        room.look();
    }

    @Test
    void testSetExit() {
        room.setExit("direction", new Room("description", "product", "descrip", 0d));
    }

    @Test
    void testGetLongDescription() {
        String result = room.getLongDescription();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGetExit() {
        Room result = room.getExit("direction");
        Assertions.assertEquals(new Room("description", "product", "descrip", 0d), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme