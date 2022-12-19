package tests;

import main.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RegexTest {
    private String input;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(new Object[][]{
                {"<img src=\"#\">", true},
                {"", false},
                {"<img alt=1 src=>\"#\"", false},
                {"123", false}
        });
    }

    public RegexTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }


//    /*
//    Проверка одного варианта
//     */
//    @Test
//    public void regexForImgIsCorrect() {
//        String input = "<img src=\"#\">";
//        Assert.assertTrue(input.matches(Main.regexImgPattern));
//    }

    @Test
    public void regexForImgIsCorrect() {
        Assert.assertEquals(expected, input.matches(Main.regexImgPattern));
    }


}
