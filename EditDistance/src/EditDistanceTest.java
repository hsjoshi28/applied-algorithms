import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class EditDistanceTest {
    private static EditDistance distance;
    @Test
    protected static void testOne(){
        String word1 = "Hello";
        String word2 = "Hello";
        assertEquals(0,distance.editDistance(word1, word2));
    }


}