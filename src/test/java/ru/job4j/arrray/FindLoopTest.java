package ru.job4j.arrray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas1Then0() {
        int[] data = new int[] {16, 0, 2, 1};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {8, 4, 6, 12};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}