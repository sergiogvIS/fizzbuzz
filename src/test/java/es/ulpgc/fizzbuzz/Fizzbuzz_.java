package es.ulpgc.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Fizzbuzz_ {
    Fizzbuzz f;
    @Before
    public void setUp() throws Exception {
        f = new Fizzbuzz();
    }
    @Test
    public void given_1_should_return_1() {
        assertThat(f.get(1)).isEqualTo("1");
    }

    @Test
    public void given_2_should_return_2() {
        assertThat(f.get(2)).isEqualTo("2");
    }

    @Test
    public void given_3_should_return_Fizz() {
        assertThat(f.get(3)).isEqualTo("Fizz");
    }

    @Test
    public void given_5_should_return_Buzz() {
        assertThat(f.get(5)).isEqualTo("Buzz");
    }

    @Test
    public void given_6_should_return_Fizz() {
        assertThat(f.get(6)).isEqualTo("Fizz");
    }
    @Test
    public void given_15_should_return_FizzBuzz() {
        assertThat(f.get(15)).isEqualTo("FizzBuzz");
    }
}
