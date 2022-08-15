package mockito.learning.example.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockCreateTest {

    @Mock
    private List<Integer> list;

    private List<String> anotherList;

    @Test
    void testMock() {
        int a = anyInt();
        list.get(a);
        when(1).thenReturn(11);
//        when(list.get(2)).thenReturn(12); // redundant stubbing
        int res = list.get(1);
        System.out.printf("mock return %d\n", res);

        anotherList = mock(List.class);
        when(anotherList.get(2)).thenReturn("another mock");
        System.out.printf("mock return %s\n", anotherList.get(2));
    }

    @Test
    void mockFinalClass() {
        //FinalClazz finalClazz = mock(FinalClazz.class, new MockSettingsImpl<>().lenient().stubOnly().defaultAnswer(RETURNS_DEFAULTS));
        FinalClazz finalClazz = mock(FinalClazz.class);
        doNothing().when(finalClazz).sayHello();

        //finalClazz.sayHello();

        //verify(finalClazz, only());
    }

    @Test
    void mockEnum() {
        MockEnum mockEnum = mock(MockEnum.class);
    }

    @Test
    void mockFinalMethod() {
        FinalMethodClass finalMethodClass = mock(FinalMethodClass.class, new MockSettingsImpl<>().lenient().stubOnly().defaultAnswer(RETURNS_DEFAULTS));
        doNothing().when(finalMethodClass).sayHello();
    }

    private final class FinalClazz {
        public void sayHello() {
            System.out.println("hello");
        }
    }

    enum MockEnum {
        A, B
    }

    private class FinalMethodClass {
        public final void sayHello() {
            System.out.println("hello");
        }
    }
}
