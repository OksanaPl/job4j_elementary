package ru.job4j.arrray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to3() {
        int[] input = {6, 2, 5, 7};
        int source = 1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {6, 7, 5, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {4, 8, 1, 3, 9, 12};
        int source = 2;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 8, 9, 3, 1, 12};
        assertThat(result).containsExactly(expected);
    }
}