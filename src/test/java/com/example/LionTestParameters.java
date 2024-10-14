package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LionTestParameters {
    String sex;
    Boolean haveMane;

    public LionTestParameters(String sex, Boolean haveMane) {
        this.sex = sex;
        this.haveMane = haveMane;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getDateSetForOrder() {
        return Arrays.asList(new Object[][] {
                { "Самец", true },
                { "Самка", false },
        });
    }

    @Test
    public void checkHaveMane() throws Exception {
        Lion lion = new Lion(this.sex);
        Assert.assertEquals(this.haveMane,lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void InvalidSex() throws Exception {
        Lion lion = new Lion("Гендер");
    }
}
