/**
 * Jakarta Bean Validation TCK
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.beanvalidation.tck.tests.integration.cdi.executable;

import jakarta.validation.executable.ValidateOnExecution;

/**
 * @author Gunnar Morling
 */
@ValidateOnExecution
public class OrderServiceImpl implements OrderService {

	@Override
	public Order placeOrder(String name) {
		return new Order();
	}

	@Override
	public Order getOrder() {
		return null;
	}
}
