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
package org.oss.evaluator.function.math;
import org.oss.evaluator.function.FunctionArgument;
import org.oss.evaluator.operator.AbstractNumericOperator;

public abstract class AbstractNumericOperatorAssociativityLeftOneArg extends AbstractNumericOperator {


	public AbstractNumericOperatorAssociativityLeftOneArg(String name, Precedence precendence) {
		super(name, 1, Associativity.LEFT, precendence);
	}


	@SuppressWarnings("unchecked")
	@Override
	public FunctionArgument<?> execute(FunctionArgument<?>... args) throws IllegalArgumentException {
		assertNumArgs(args);
		assertNumeric(args);
		return execute((FunctionArgument<Double>)args[0]);
	}

	abstract protected FunctionArgument<Double> execute(FunctionArgument<Double> a) throws IllegalArgumentException;

}
