package com.cobia.util;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringUtilTest {

    @Test
    public void shouldReturnTrueIfEmailContainsAt(){
        assertThat(StringUtil.verifyEmail("garen@lol.com"), is(true));
    }
    @Test
    public void shouldReturnFalseIfEmailLacksAt(){
        assertThat(StringUtil.verifyEmail("garenlol.com"), is(false));
    }
}
