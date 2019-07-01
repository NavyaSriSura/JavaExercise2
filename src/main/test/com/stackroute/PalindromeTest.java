package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
 @Before
    public void setUp()
 {
     palindrome =new Palindrome();
 }
 @After
    public void  tearDown()
 {
      palindrome=null;
 }
 @Test
    public void testGivenANumberCheckItIsaPalindromeOrNot()
 {
     boolean result=palindrome.checkPalindrome(232);
     assertEquals(true,result);
 }
 @Test
 public void testGivenANumberShouldReturnFalse()
 {
     boolean result=palindrome.checkPalindrome(234);
     assertEquals(false,result);
 }
 @Test
    public void testGivenAPalindromeShouldReturnTrue()
 {
     boolean result=palindrome.checkPalindrome(121);
     assertEquals(true,result);
 }
 @Test
    public void testGivenZeroReturnTrue()
 {
     boolean result=palindrome.checkPalindrome(0);
     assertEquals(result,true);
 }
}