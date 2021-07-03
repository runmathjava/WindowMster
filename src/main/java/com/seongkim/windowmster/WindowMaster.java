/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seongkim.windowmster;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class WindowMaster {
    public static void main(String[] args) {
        // declare variables for height, width, unit price of glass,
        // unit price of trim, and number of windows
        float height;
        float width;
        float unitPriceOfGlass;
        float unitPriceOfTrim;
        int numberOfWindows;
        
        //declare String variables to hold user's input for height, width,
        // unit price of glass, unit price of trim, and number of windows
        String stringHeight;
        String stringWidth;
        String stringUnitPriceOfGlass;
        String stringUnitPriceOfTrim;
        String stringNumberOfWindows;
        
        //declare other varibles
        float areaOfWindow;
        float costOfGlassForEachWindow;
        float costOfGlass;
        float perimeterOfWindow;
        float costOfTrimForEachWindow;
        float costOfTrim;
        float costForEachWindow;
        float cost;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter the window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Pls enter the width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Pls enter the unit price of glass: ");
        stringUnitPriceOfGlass = myScanner.nextLine();
        System.out.println("Pls enter the unit price of trim: ");
        stringUnitPriceOfTrim = myScanner.nextLine();
        System.out.println("Pls enter the number of windows");
        stringNumberOfWindows = myScanner.nextLine();
        
        // convert String values of height, width, unit price of glass, and
        // unit price of trim to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        unitPriceOfGlass = Float.parseFloat(stringUnitPriceOfGlass);
        unitPriceOfTrim = Float.parseFloat(stringUnitPriceOfTrim);
        
        // convert String value of number of windows to integer value
        numberOfWindows = Integer.parseInt(stringNumberOfWindows);
        
        // calculate the area of a window, i.e., the area of glass
        // for each window
        areaOfWindow = height * width;
        
        // calculate the cost of glass for each window
        costOfGlassForEachWindow = unitPriceOfGlass * areaOfWindow;
        
        // calculate the cost of glass for all windows
        costOfGlass = numberOfWindows * costOfGlassForEachWindow;
        
        // calculate the perimeter of a window, i.e., the length of trim
        // for each window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the cost of trim for each window
        costOfTrimForEachWindow = unitPriceOfTrim * perimeterOfWindow;
        
        // calulate the cost of trim for all windows
        costOfTrim = numberOfWindows * costOfTrimForEachWindow;
        
        // calculate the cost for each window
        costForEachWindow = costOfGlassForEachWindow + costOfTrimForEachWindow;
        
        // calculate the total cost
        cost = numberOfWindows * costForEachWindow;
        
        //display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("The number of windows = " + numberOfWindows);
        System.out.println("The cost of glass for each window is as follows.");
        System.out.println(costOfGlassForEachWindow);
        System.out.println("So, the total cost of glass = " + costOfGlass);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("The cost of trim for each window is as follows.");
        System.out.println(costOfTrimForEachWindow);
        System.out.println("So, the total cost of trim = " + costOfTrim);
        System.out.println("The cost for each window = " + costForEachWindow);
        System.out.println("Total cost = " + cost);
        }
}