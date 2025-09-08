package br.com.jdp.math;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FizzBussTest {

    @Test
    void case1() {
        List<String> expected = List.of("1", "2", "Fizz");
        Assertions.assertThat(FizzBuss.fizzBuzz(3)).isEqualTo(expected);
    }

    @Test
    void case2() {
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        Assertions.assertThat(FizzBuss.fizzBuzz(15)).isEqualTo(expected);
    }
}