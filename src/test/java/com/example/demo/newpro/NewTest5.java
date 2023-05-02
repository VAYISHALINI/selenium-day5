package com.example.demo.newpro;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class NewTest5 {
  @Test(dataProvider = "dp")
  public void add(int n1, int n2,int e) {
	 int actual=n1+n2;
	 Assert.assertEquals(actual,e);
  }
  
  @Test(dataProvider = "dp1")
  public void sub(int n1, int n2,int e) {
	 int actual=n1-n2;
	 Assert.assertEquals(actual,e);
  }
  
  @Test(dataProvider = "dp2")
  public void mul(int n1, int n2,int e) {
	 int actual=n1*n2;
	 Assert.assertEquals(actual,e);
  }
  @Test(dataProvider = "dp3")
  public void div(int n1, int n2,int e) {
	 int actual=n1/n2;
	 Assert.assertEquals(actual,e);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2,3 },
      new Object[] { 2,3,5},
    };
  }
  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { 3, 2,1},
      new Object[] { 8,4,4},
    };
  }
  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { 2, 2,4 },
      new Object[] { 8,2,16},
    };
  }
  @DataProvider
  public Object[][] dp3() {
    return new Object[][] {
      new Object[] {6, 2,3},
      new Object[] { 8,4,2},
    };
  }
}
