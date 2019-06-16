package com.sda.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextTest {

    @Test
    public void getText() {

        //given
        //when
        String returned = Text.getText();
        String expected = "Hello word";
        //then
        assertEquals(expected, returned);
    }


    @Test
    public void incorecctgetText() {

        //given
        //when
        String returned = Text.getText();
        String expected = "Hello word";
        //then
        assertEquals(expected, returned);
    }
}