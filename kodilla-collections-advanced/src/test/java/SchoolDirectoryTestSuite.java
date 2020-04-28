import com.kodilla.collections.adv.maps.homework.School;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchoolDirectoryTestSuite {

    @Test
    public void shouldGetCorrectLenght(){
        School podstawowka = new School("test", 1, 1, 1);
        assertEquals(3,podstawowka.getSize() );
    }
    @Test
    public void shouldGetCorrecSum(){
        School podstawowka = new School("test", 10, 10, 10, 10, 10, 10);
        assertEquals(60,podstawowka.sumStudent() );
    }




}
