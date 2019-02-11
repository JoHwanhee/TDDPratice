package stringTest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest  {
	
    @Test
    void split() {
        String[] valuse = "1".split(",");
        
        Assertions.assertArrayEquals(valuse, new String[] {"1"});
        
        String[] valuse2 = "1,2".split(",");
        Assertions.assertArrayEquals(valuse2, new String[] {"1", "2"});
    }
    
    @Test
    void getBytes() {
    	byte[] bytes = "abc".getBytes();
        Assertions.assertArrayEquals(bytes, new byte[] {97, 98, 99});
    }
    
    @Test
    void subString() {
    	String input = "(1,2)";
    	String result = input.substring(1, input.length() - 1);
    	assertTrue(result.equals("1,2"));
    	
    	
    }
}