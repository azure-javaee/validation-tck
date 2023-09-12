/**
 * Jakarta Validation TCK
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.beanvalidation.tck.tests.constraints.groups.groupsequenceisolation;

import jakarta.validation.GroupSequence;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;


/**
 * @author Hardy Ferentschik
 */
@GroupSequence({ Minimal.class, E.class })
public class E {

	public E() {
		f = new F1();
	}

	@Max(value = 10, groups = Minimal.class)
	int size;

	@Size(max = 20)
	String name;

	@Valid
	F1 f;
}
