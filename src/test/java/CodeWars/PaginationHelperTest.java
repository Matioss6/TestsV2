package CodeWars;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PaginationHelperTest {

    List<Integer> collection = new ArrayList<>();



        @org.junit.Test
        public void testForHappyFlow() throws Exception {

            Integer[] a = {1,2,3,4,5,6,7,8,9,10,11};
            collection= Arrays.stream(a).toList();

            PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 3);

            assertEquals(11, helper.itemCount());
            assertEquals(4, helper.pageCount());

            assertEquals(1, helper.pageIndex(5));

            assertEquals(3, helper.pageIndex(10));

            assertEquals(-1, helper.pageIndex(11));
            assertEquals(0, helper.pageIndex(0));
            assertEquals(0, helper.pageIndex(1));
            assertEquals(0, helper.pageIndex(2));
            assertEquals(1, helper.pageIndex(3));
            assertEquals(3, helper.pageItemCount(1));




        }
}
