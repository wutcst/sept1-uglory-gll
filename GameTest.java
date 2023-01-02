package cn.edu.whut.sept.zuul;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class GameTest {
    @Mock
    Parser parser;
    //Field order of type Room[] - was not mocked since Mockito doesn't mock arrays
    @InjectMocks
    Game game;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testPlay() {
        when(parser.getCommand()).thenReturn(new Command("firstWord", "secondWord"));

        game.play();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme