package cn.edu.whut.sept.zuul;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class ParserTest {
    @Mock
    CommandWords commands;
    //Field reader of type Scanner - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @InjectMocks
    Parser parser;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetCommand() {
        when(commands.isCommand(anyString())).thenReturn(true);

        Command result = parser.getCommand();
        Assertions.assertEquals(new Command("firstWord", "secondWord"), result);
    }

    @Test
    void testShowCommands() {
        parser.showCommands();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme