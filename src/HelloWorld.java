import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class HelloWorld {

    @Test
    void setup(){
        System.out.println(" hello kutty");
    }

    @Test
    void testSteps(){
        System.out.println("inside steps");
    }

    @Test
    void tearDown(){
        System.out.println("tear down");
    }
}

