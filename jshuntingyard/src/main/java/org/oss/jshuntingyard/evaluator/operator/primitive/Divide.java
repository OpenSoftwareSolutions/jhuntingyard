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
package org.oss.jshuntingyard.evaluator.operator.primitive;
import org.oss.jshuntingyard.evaluator.FunctionArgumentFactory;
import org.oss.jshuntingyard.evaluator.FunctionElementArgument;
import org.oss.jshuntingyard.evaluator.IntegerArgument;

public class Divide extends AbstractTwoArgNumericFunctionElement {

	public Divide() {
		super("/", Precedence.MULTIPLICATIVE);
	}


	@Override
	protected FunctionElementArgument<?> execute(FunctionElementArgument<?> a,
			FunctionElementArgument<?> b) throws IllegalArgumentException {
		if (a.getType()==FunctionElementArgument.ArgumentType.INTEGER && b.getType()==FunctionElementArgument.ArgumentType.INTEGER) {
			int aVal = ((IntegerArgument)a).getValue();
			int bVal =  ((IntegerArgument)b).getValue();
			if (aVal % bVal == 0) {
				return FunctionArgumentFactory.createObject( aVal / bVal);
			}

		}
		return FunctionArgumentFactory.createObject(getDouble(a) / getDouble(b));
	}

	@Override
	public boolean isUserFunction() {
		return false;
	}
}