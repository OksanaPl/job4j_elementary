package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax8To4Then8() {
        int left = 8;
        int right = 4;
        int expected = 8;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To22Then22() {
        int left = 9;
        int right = 22;
        int expected = 22;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To22Then22() {
        int left = 22;
        int right = 22;
        int expected = 22;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}