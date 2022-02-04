import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstTest {

    @Test
    void hello(){

        // Given
        int num1 = 4;
        int num2 = 5;
        // when
        int result = num1 + num2;
        //Then
        assertThat(result).isEqualTo(9);

    }
}
