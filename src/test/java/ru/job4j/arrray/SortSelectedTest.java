package ru.job4j.arrray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

    public class SortSelectedTest {
        @Test
        public void whenSortThree() {
            int[] data = new int[] {4, 8, 1};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {1, 4, 8};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenSort() {
            int[] data = new int[] {3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {1, 2, 3, 4, 5};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenSortFive() {
            int[] data = new int[] {0, 4, 9, 6, 7};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {0, 4, 6, 7, 9};
            assertThat(result).containsExactly(expected);
        }
}