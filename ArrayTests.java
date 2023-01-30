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
    int[] input3 = { 2,3,5,7,7,7 }; 
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 7,7,7,5,3,2 }, input3);
  }

  @Test
  public void testAverageWithoutLowest2Vars() {
    double[] input4 = { 7.0, 8.0 }; 
    double avg = ArrayExamples.averageWithoutLowest(input4);
    assertEquals(8.0, avg,0.0001);
  }

  @Test
  public void testAverageWithoutLowest3Vars() {
    double[] input4 = { 1.0, 2.0, 3.0 }; 
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input4),
        0.0001);
  }

  @Test
  public void testAverageWithoutLowest1Var() {
    double[] input4 = { 7.0}; 
    double avg = ArrayExamples.averageWithoutLowest(input4);
    assertEquals(0.0, avg,0.0001);
  }
}
