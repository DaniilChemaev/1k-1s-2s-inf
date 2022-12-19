package tests;

import models.Vector2D;
import org.junit.Assert;
import org.junit.Test;

public class TestVector2D {
    @Test
    public void testVector2D() {
        Vector2D vector2D1 = new Vector2D(4, 6);
        Vector2D result = new Vector2D(8, 12);
        Vector2D.add(vector2D1, vector2D1);
        Assert.assertEquals(result, Vector2D.add(vector2D1, vector2D1));
    }
}
