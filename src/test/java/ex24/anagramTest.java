package ex24;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class anagramTest extends TestCase {

    @Test
    public void testIsAnagram() {
        Assertions.assertTrue(anagram.isAnagram("note", "tone"));
        Assertions.assertFalse(anagram.isAnagram("dog", "cat"));
    }


}