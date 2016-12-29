package com.noel;

public class Main {
    public static void main(String[] args) {

        int size = 4;
        int count = 1;
        int spaceCount = size - 1;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < spaceCount; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            count += 2;
            spaceCount--;
            System.out.println();
        }
        count -= 2;
        spaceCount++;
        for (int i = 0; i < (size - 1); i++) {
            count -= 2;
            spaceCount++;
            for (int k = 0; k < spaceCount; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(count);
        System.out.println(spaceCount);

        Diamond myDiamond = new Diamond();
        size = 3;
        count = 1;
        spaceCount = size - 1;
        /*
		 * using methods
		 */
        for (int i = 0; i < size; i++) {
            spaceCount = myDiamond.spaces(spaceCount);
            count = myDiamond.stars(count);
            count += 2;
            spaceCount--;
            System.out.println();
        }
        count -= 2;
        spaceCount++;
        for (int i = 0; i < (size - 1); i++) {
            count -= 2;
            spaceCount++;
            spaceCount = myDiamond.spaces(spaceCount);
            count = myDiamond.stars(count);
            System.out.println();
        }


    }

    static void spaces(int spaceCount) {


    }

}
