package com.mdc.DesignPattern.Creartional.Immutable;

final public class ImmutableString {
  final String value;

  ImmutableString(String value) {
      this.value = value;
  }

  public String getValue() {
      return value;
  }
}
