import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { }; 
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedBigArray() {
    int[] input2 = { 7,5,3 }; 
    assertArrayEquals(new int[]{ 3, 5, 7 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReverseInPlaceArray() {
    int[] input3 = { 2,3 }; 
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 3,2 }, input3);
  }
}
