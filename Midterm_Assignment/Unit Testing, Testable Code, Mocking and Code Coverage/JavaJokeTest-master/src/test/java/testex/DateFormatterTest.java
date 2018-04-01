/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testex;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Diana
 */
public class DateFormatterTest {

    private IDateFormatter dateFormatter;

    public DateFormatterTest() {
    }

    @Before
    public void setup() {
        dateFormatter = new DateFormatter();
    }

    @Test(expected = JokeException.class)
    public void testExceptionIsThrownIfIllegalTimeZoneString() throws JokeException {
        dateFormatter.getFormattedDate("unknown timezone", new Date());
    }

    // just a single test, to see if it is working
    // unfortunately I don't have the time to test all the time zones
    @Test
    public void testThatTheTimeZoneWorksForCopenhagen() throws JokeException {
        String expected = "31 Mar 2018 11:08 PM";
        assertThat(dateFormatter.getFormattedDate("Europe/Copenhagen", new Date(2018 - 1900, 2, 31, 23, 8)), is(expected));
    }

}
