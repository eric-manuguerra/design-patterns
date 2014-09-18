package com.sqli.patterns.decorator;

/**
 * @author eric.manuguerra
 */
public class XenonLightsDecorator extends VehicleDecorator
{
    public XenonLightsDecorator(VehicleDesigner designer)
    {
	super(designer);
    }

    @Override
    public void draw()
    {
	designer.draw();
	System.out.println("Decorating with Xenon lights ...");
    }
}
