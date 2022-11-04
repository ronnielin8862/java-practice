package testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialTest {

    @BeforeAll
    public static void before(){
        System.out.println("test beforeAll");
    }

    @Test
    @DisplayName("測試Tag 這是啥鬼") // 這樣無效
    public void test(){
        System.out.println("start");
        assertEquals(3, 4);
    }

    @Test
    public void testSameClass(){
        String A = "AA";

        var B = getString(A);

        assertEquals("AA",B);
        assertEquals("AB",B);
    }


    private String getString(String a) {
        return a;
    }

    @Test
    public void TestDifClass(){
        String AA = "NN";
        TestClass TC = new TestClass();
        var BB = TC.GetStringA(AA);
        assertEquals("錯了啦87", "NN", BB);
//        assertEquals("錯了啦87", "CC", BB);
    }
}
