package org.oss.evaluator.function.impl;

import org.oss.evaluator.function.AbstractFunctionArgument;
import org.oss.evaluator.function.FunctionArgument;

/**
 * Copyright [2015] [Open Software Solutions GmbH]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
public class DoubleArgument extends AbstractFunctionArgument<Double> implements Comparable<DoubleArgument>{

	private final Double doubleValue;

	DoubleArgument(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	@Override
	public FunctionArgument.ArgumentType getType() {
		return FunctionArgument.ArgumentType.DOUBLE;
	}

	@Override
	public Double getValue() {
		return doubleValue;
	}

	@Override
	public int compareTo(DoubleArgument o) {
		return doubleValue.compareTo(o.getValue());
	}
}