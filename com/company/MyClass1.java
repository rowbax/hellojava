package com.company;

import java.util.Objects;

public class MyClass1 {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    Integer int;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass1 myClass1 = (MyClass1) o;
        return Objects.equals(str, myClass1.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str);
    }
}


