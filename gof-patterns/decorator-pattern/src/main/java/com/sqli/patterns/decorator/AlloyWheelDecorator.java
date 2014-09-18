package com.sqli.patterns.decorator;

/**
 * @author eric.manuguerra
 */
public class AlloyWheelDecorator extends VehicleDecorator
{

    public AlloyWheelDecorator(VehicleDesigner designer)
    {
	super(designer);
    }

    @Override
    public void draw()
    {
	designer.draw();
	System.out.println("Decorating with alloy wheels ...");
    }
}
