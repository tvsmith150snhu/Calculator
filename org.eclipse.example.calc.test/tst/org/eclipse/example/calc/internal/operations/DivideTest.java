/*******************************************************************************
 * Copyright (C) 2010, Matthias Sohn <matthias.sohn@sap.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.example.calc.internal.operations;

import static org.junit.Assert.*;

import org.eclipse.example.calc.BinaryOperation;
import org.junit.Before;
import org.junit.Test;

public class DivideTest extends AbstractOperationTest {

	private BinaryOperation op;

	@Before
	public void setUp() throws Exception {
		op = new Divide();
	}

	@Test
	public void testPerform() {
		assertEquals(2.0, op.perform(4.0F, 2.0F), 0.01F);
	}

	@Test
	public void testGetName() {
		assertEquals(op.getName(), "/");
	}

}
