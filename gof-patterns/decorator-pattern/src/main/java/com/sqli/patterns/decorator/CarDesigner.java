package com.sqli.patterns.decorator;

/**
 * @author eric.manuguerra
 */
public class CarDesigner implements VehicleDesigner
{
    @Override
    public void draw()
    {
	// draw car
	System.out.println("Drawing car...");
    }
}
