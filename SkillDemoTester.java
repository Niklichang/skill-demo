import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testSubtract{
        assertEquals(2, SkillDemo.subtract(4, 3));// fails
    }
}
