package org.pradeepnnv.versiondemo;

public class VersionDemo {
  public static void main(String[] args) {
    System.out.println("Hey there!!!!"+"\n");
    System.out.println("This program is running version " +
               VersionDemo.class.getPackage().getImplementationVersion());
  }
}
