import org.junit.Test;

import static org.junit.Assert.*;

class QuickSelectTest {
    @Test
    public void SelectOne() {
        int[] A = {2, 5, 6, 4, 3, 0}; // {0, 2, 3, 4, 5, 6}
        assertEquals(QuickSelect.select(A, 0), 0);
        assertEquals(QuickSelect.select(A, 1), 2);
        assertEquals(QuickSelect.select(A, 2), 3);
    }

}