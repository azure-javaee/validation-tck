/**
 * Jakarta Bean Validation TCK
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.beanvalidation.tck.tests.integration.cdi.executable.types;

import jakarta.inject.Inject;
import jakarta.validation.constraints.Size;
import jakarta.validation.executable.ExecutableType;
import jakarta.validation.executable.ValidateOnExecution;

/**
 * @author Gunnar Morling
 */
public class OnlineCalendarService {

	@Inject
	@ValidateOnExecution(type = ExecutableType.CONSTRUCTORS)
	public OnlineCalendarService(@LongName @Size(min = 5) String name) {
	}
}
