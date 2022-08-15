package mockito.learning.example.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;

@ExtendWith(MockitoExtension.class)
public class StubTest {

    @Mock
    private Person person;

//    @Mock
//    private FinalClassPerson finalClassPerson;

    @Test
    void sayTest() {
        doNothing().when(person).say(anyString());

        person.say("hello");
    }

//    @Test
//    void finalPersonSay() {
//        doNothing().when(finalClassPerson).finalSay(anyString());
//        finalClassPerson.finalSay("hello");
//    }

    private class Person{
        void say(String msg) {
            System.out.println(msg);
        }
    }
}
