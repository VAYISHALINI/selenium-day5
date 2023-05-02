package com.example.demo.newpro;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest1 {
  @Test(priority=1)
  public void add() {
	  int n=3+2;
	  Assert.assertEquals(n,5);
	  
  }
  @Test(priority=2)
  public void sub() {
	  int n=3-2;
	  Assert.assertEquals(n,1);
  }
  @Test(priority=3)
  public void mul() {
	  int n=3*2;
	  Assert.assertEquals(n,6);
  }
  @Test(priority=4)
  public void div() {
	  int n=6/2;
	  Assert.assertEquals(n,3);
  }
}
