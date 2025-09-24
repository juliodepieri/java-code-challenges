package br.com.jdp.others;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void case1() {
        Assertions.assertThat(ValidParentheses.isValid("()[]{}")).isTrue();
    }

    @Test
    void case2() {
        Assertions.assertThat(ValidParentheses.isValid("([)]")).isFalse();
    }


}