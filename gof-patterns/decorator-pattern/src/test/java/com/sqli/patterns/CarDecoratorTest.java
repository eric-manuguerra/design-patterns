package com.sqli.patterns;

import com.sqli.patterns.decorator.AlloyWheelDecorator;
import com.sqli.patterns.decorator.CarDesigner;
import com.sqli.patterns.decorator.MetalFlakePaintDecorator;
import com.sqli.patterns.decorator.VehicleDesigner;
import com.sqli.patterns.decorator.XenonLightsDecorator;
import org.junit.Test;

/**
 * @author eric.manuguerra
 */
public class CarDecoratorTest
{

    @Test
    public void testDecorator()
    {
	final VehicleDesigner carDesigner = new CarDesigner();
	final XenonLightsDecorator designer =
		new XenonLightsDecorator(new AlloyWheelDecorator(new MetalFlakePaintDecorator(carDesigner)));

	designer.draw();


    }
}
