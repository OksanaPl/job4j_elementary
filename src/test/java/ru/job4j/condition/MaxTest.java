package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To8Then8() {
        int a = 8;
        int b = 4;
        int c = 6;
        int expected = 8;
        int result = Max.max(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To62Then62() {
        int a = 8;
        int b = 4;
        int c = 6;
        int d = 62;
        int expected = 62;
        int result = Max.max(a, b, c, d);
        assertThat(result).isEqualTo(expected);
    }
}