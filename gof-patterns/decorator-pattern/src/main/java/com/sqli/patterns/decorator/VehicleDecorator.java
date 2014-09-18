package com.sqli.patterns.decorator;

/**
 * @author eric.manuguerra
 */
public abstract class VehicleDecorator  implements VehicleDesigner
{

    protected VehicleDesigner designer;

    protected VehicleDecorator(VehicleDesigner designer)
    {
	this.designer = designer;
    }

    public void draw()
    {
	designer.draw();
    }
}
