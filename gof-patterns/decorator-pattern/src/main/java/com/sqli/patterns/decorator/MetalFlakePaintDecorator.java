package com.sqli.patterns.decorator;

/**
 * @author eric.manuguerra
 */
public class MetalFlakePaintDecorator extends VehicleDecorator
{
    public MetalFlakePaintDecorator(VehicleDesigner designer)
    {
	super(designer);
    }

    @Override
    public void draw()
    {
	super.draw();
	System.out.println("Decorating outer body with metal flake paint ...");
    }
}
