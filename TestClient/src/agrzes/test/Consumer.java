/**
 * 
 */
package agrzes.test;

import agrzes.test.osgi.OsgiService;

/**
 * @author gabramczyk
 *
 */
public class Consumer {
	

	
	public void setService(OsgiService service )
	{
		if (service!=null)
		{
			System.out.println("Jupi");
			System.out.println(service.service());
		}
	}
	public Consumer()
	{
		System.out.println("Consumer created");
	}
}
