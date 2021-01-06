package org.pradeepnnv.versiondemo;

public class VersionDemo {
  public static void main(String[] args) {
    System.out.printf("Hi there!!!!!.\nVersion of the program \"%s\" is \"%s\"",
          VersionDemo.class.getPackage().getName(),
          VersionDemo.class.getPackage().getImplementationVersion() );               
  }
}
