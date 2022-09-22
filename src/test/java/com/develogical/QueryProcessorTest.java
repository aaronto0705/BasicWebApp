package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Pokemon"), containsString("Nintendo"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("pokemon"), containsString("Nintendo"));
    }

    @Test
    public void checkingForName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("Arn"));
    }
    
    @Test
    public void checkForLargest() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 54, 913, 55, 494"), containsString("913"));
    }

    @Test
    public void checkAddition() throws Exception {
        assertThat(queryProcessor.process("what is 11 plus 15"), containsString("26"));
    }

    @Test
    public void checkSquare() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is both a square and a cube: 531441, 155, 50, 117649"), containsString("531441"));
    }

    

}
