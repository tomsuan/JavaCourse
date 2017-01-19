package com.noel;

public class Diamond {

    int spaces(int spaceCount) {
        for (int k = 0; k < spaceCount; k++) {
            System.out.print(" ");
        }
        return spaceCount;

    }

    int stars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
        return count;
    }
}
