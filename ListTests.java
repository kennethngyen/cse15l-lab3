import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

public class ListTests {

  String[] stringArr = {"apple","applepie"};
	@Before
  public void setUp(){
    
  }

  @Test 
	public void testFilter4Strings() {
    //a list that goes {"apple", "applepie"}
    List<String> input1 = new ArrayList<>();
    input1.add("apple");
    input1.add("applepie");
    input1.add("abid");
    input1.add("benny");


    //create a stringChecker class object
    StringCheckerClass sc = new StringCheckerClass();
    //filter out which strings contain "a"
    List<String> result = ListExamples.filter( input1,sc);
    //copy all items of List into a string array
    String[] str = new String[result.size()];
    for (int i = 0; i < result.size(); i++) {
        str[i] = result.get(i);
        System.out.println(str[i]);
    }
    //compare if order works; should go "apple", "applepie", "abid" and
    //exclude "benny" because it doesn't contain an "a"
    assertArrayEquals(new Object[]{"apple","applepie","abid"}, str);
	}

  @Test //useless
	public void testFilterNull() {
    //a list that goes {null, "null", null}
    List<String> input1 = new ArrayList<>();
    input1.add("null");
    input1.add("null");
    //create a stringChecker class object
    StringCheckerClass sc = new StringCheckerClass();
    //filter out which strings contain "a"
    List<String> result = ListExamples.filter(input1,sc);
    //copy all items of List into a string array
    String[] str = new String[result.size()];
    for (int i = 0; i < result.size(); i++) {
        str[i] = result.get(i);
        System.out.println(str[i]);
    }
    //compare if order works; should go "apple", "applepie", "abid" and
    //exclude "benny" because it doesn't contain an "a"
    assertArrayEquals(new Object[]{}, str);
	}


  @Test
  public void testMergedDefaultCase() {
    List<String> input1 = new ArrayList<String>();
    input1.add("c");
    input1.add("e");
    List<String> input2 = new ArrayList<String>();
    input1.add("b");
    input1.add("d");
    List<String> input3 = ListExamples.merge(input1,input2);
    String[] str = new String[input3.size()];
    for (int i = 0; i < input3.size(); i++) {
      str[i] = input3.get(i);
      System.out.println(str[i]);
  }

    assertArrayEquals(new String[]{"a","b","c","d" }, str);
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
