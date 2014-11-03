/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.shared.client.util;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.core.config.BaseConfig;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a single sorter configuration that can be applied to a Store
 */
public class SorterConfig extends BaseConfig {

	public SorterConfig() {
		jsObj = JsoHelper.createObject();
	}

	public SorterConfig(String property, Direction direction) {
		this();
		this.setProperty(property);
		this.setDirection(direction);
	}

	public void setDirection(Direction direction) {
		JsoHelper.setAttribute(getJsObj(), "direction", direction.getValue());
	}

	public native void setSorterFn(SorterFunction fn)/*-{
		var f = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		f.filterFn = $entry(function(item1, item2) {
			var model1 = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(item1);
			var model2 = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(item2);
			return fn.@com.ait.toolkit.sencha.shared.client.util.SorterFunction::onSort(Lcom/ait/toolkit/data/client/BaseModel;Lcom/ait/toolkit/data/client/BaseModel;)(model1, model2);
		});
	}-*/;

	public void setRoot(String value) {
		JsoHelper.setAttribute(getJsObj(), "root", value);
	}

	public void setProperty(String value) {
		JsoHelper.setAttribute(getJsObj(), "property", value);
	}

	public void setValue(String value) {
		JsoHelper.setAttribute(getJsObj(), "value", value);
	}

	public void setValue(JavaScriptObject value) {
		JsoHelper.setAttribute(getJsObj(), "value", value);
	}

}
