package UnitTestingExample.src.unit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class findMaxtest {
    @Test
    void contextload(){
    
    }
    
    @Test
    public void testFindMax() {
        MaxFinder maxFinder = new MaxFinder();
        int[] numbers = {1, 3, 4, 2};
        int expectedResult = 4;
        int actualResult = maxFinder.findMax(numbers);
        assertEquals(expectedResult, actualResult);
    }
}


