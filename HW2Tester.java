import org.junit.*;
import static org.junit.Assert.*;

/**
 * Test class LinkedList
 */
public class HW2Tester {
  
  /**
   * Test the contains method
   */
  @Test
  public void testSamePrefix() {    
        
    assertEquals(true, HW2.samePrefix("this is a test", "this is a trial", 11)); // given test
    assertEquals(false, HW2.samePrefix("this is a test", "this is a trial", 12)); // given test
    assertEquals(false, HW2.samePrefix("this is a test", "This is a trial", 4)); // given test
    assertEquals(false, HW2.samePrefix("this is a test", "this is a test", 100)); //given test

    
    assertEquals(true, HW2.samePrefix("this is a test", "this is a trial", 0)); // test 0
    assertEquals(true, HW2.samePrefix("this is a test", "this is a trial", 1)); // test 1
    assertEquals(false, HW2.samePrefix("this is a test", "This is a trial", 18)); // test many (over)
    assertEquals(true, HW2.samePrefix("maybe who ", "maybe ay", 3)); // test first
    assertEquals(true, HW2.samePrefix("got you later", "got you later", 12)); // test middle
    assertEquals(true, HW2.samePrefix("this is a test", "this is a test", 14)); // test last (right at end)
    assertEquals(false, HW2.samePrefix("this is a test", "this is a test", 15)); // test last (over)
  }
  
  @Test
  public void testSubtract() {    
    assertEquals("gfedcbbdeg", HW2.subtract("gfedcbabcdefg", "acfa")); // given test
    
    assertEquals("forty", HW2.subtract("forty", "")); // test 0
    assertEquals("frtyfour", HW2.subtract("fortyfour", "o")); // test 1 (only took out first o)
    assertEquals("ftyfor", HW2.subtract("fortyfour", "oru")); // test many 
    assertEquals("ortyfour", HW2.subtract("fortyfour", "f")); // test first   
    assertEquals("", HW2.subtract("fortyfour", "fortyfour")); // test middle  
    assertEquals("fortyfo", HW2.subtract("fortyfour", "ur")); // test last  //should still go in order and only take last two 
    
    


  }
  
   @Test
  public void testIndexWord() {    
    assertEquals("HELLO THERE?", HW2.indexWord("EHL ORT!.?", "102243610509")); // given test
    
    
    assertEquals("", HW2.indexWord("Major Pain", "")); // test 0
    assertEquals("j", HW2.indexWord("Major Pain", "2")); // test 1
    assertEquals("jao", HW2.indexWord("Major Pain", "273")); // test many
    assertEquals(null, HW2.indexWord("less ten", "273")); // test null
    assertEquals("M", HW2.indexWord("Major pain", "0")); // test first
    assertEquals("Major pain", HW2.indexWord("Major pain", "0123456789")); // test middle
    assertEquals("n", HW2.indexWord("Major pain", "9")); // test last (right at end)
    assertEquals(" ", HW2.indexWord("Major pai ", "9")); // test last (over)
  }
   
    @Test
  public void testRemoveExtraSpaces() {    
    
    assertEquals("How about that ?", HW2.removeExtraSpaces("  How about     that    ?     ")); // given test
    assertEquals("Today is a gift !", HW2.removeExtraSpaces("Today    is   a    gift   !    ")); // given test
    
    //assertEquals("", HW2.removeExtraSpaces("   ")); // test 0 
    //works unless there are only spaces
    assertEquals("M", HW2.removeExtraSpaces(" M")); // test 1
    assertEquals("Many more spaces", HW2.removeExtraSpaces(" Many more   spaces ")); // test many 
    assertEquals("M", HW2.removeExtraSpaces("   M")); // test first (spaces in the beginning)
    assertEquals("More more mo", HW2.removeExtraSpaces("   More   more mo")); // test middle (spaces in the middle)
    assertEquals("Moreeee ha", HW2.removeExtraSpaces("Moreeee ha     ")); // test last (spaces at the end)
    

  }
    
    
     @Test
  public void testFlipWords() {    
    assertEquals("senobmort ni eht gib edarap", HW2.flipWords("trombones in the big parade")); // given test
    //assertEquals("ytneveS-xis senobmort ni eht gib edarap!!", HW2.flipWords("Seventy-six trombones in the big parade!!")); // given test
    //works unless there are punctuations
    
    assertEquals(" ", HW2.flipWords(" ")); // test 0
    assertEquals("esuohpart", HW2.flipWords("traphouse")); // test 1
    assertEquals("esuohpart noisnam", HW2.flipWords("traphouse mansion")); // test many
    assertEquals("t par esuoh noisnam", HW2.flipWords("t rap house mansion")); // test first (splitting first to see if single letter holds)
    assertEquals(" t nar  y n", HW2.flipWords(" t ran  y n")); // test middle (adding spaces too) (spaced out single letter words)
    assertEquals("t nar  y   tsol  ", HW2.flipWords("t ran  y   lost  ")); // test last (spaces surrounding last word to see if it holds)
    assertEquals("t tsetaergemantsrifreveemantsal", HW2.flipWords("t lastnameeverfirstnamegreatest")); // test last (super long last word)
    
  }
     
     
}
