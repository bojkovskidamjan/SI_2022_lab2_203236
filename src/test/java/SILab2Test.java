import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test {

    @Test
    void everyStatementTest() {
        List<String> list = new ArrayList<>(Arrays.asList("2", "#", "#", "#", "4", "#", "2", "#", "2"));
        List<String> resultList = new ArrayList<>(Arrays.asList("0", "#", "#", "#", "0", "#", "0", "#", "0"));

        assertEquals(list, SILab2.function(resultList));

        List<String> exceptionList = new ArrayList<>();
        List<String> exceptionList2 = new ArrayList<>(Arrays.asList("0", "#", "0", "#", "0", "0"));

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList));
        IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList2));


        assertEquals("List length should be greater than 0", thrown.getMessage());
        assertEquals("List length should be a perfect square", thrown2.getMessage());

    }

    @Test
    void everyBranchTest() {
        List<String> list = new ArrayList<>(Arrays.asList("2", "#", "#", "#", "4", "#", "2", "#", "2"));
        List<String> resultList = new ArrayList<>(Arrays.asList("0", "#", "#", "#", "0", "#", "0", "#", "0"));

        assertEquals(list, SILab2.function(resultList));

        List<String> exceptionList = new ArrayList<>();
        List<String> exceptionList2 = new ArrayList<>(Arrays.asList("0", "#", "0", "#", "0", "0"));

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList));
        IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class, () -> SILab2.function(exceptionList2));


        assertEquals("List length should be greater than 0", thrown.getMessage());
        assertEquals("List length should be a perfect square", thrown2.getMessage());

    }
}