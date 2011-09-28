package agrzes.test.osgi.impl;

import agrzes.test.osgi.OsgiService;

public class OsgiServiceImpl implements OsgiService {

	@Override
	public String service() {
		return "Hello Osgi";
	}

}
