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
package com.ait.toolkit.sencha.shared.client.data;

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.core.config.BaseConfig;
import com.ait.toolkit.sencha.shared.client.data.handlers.OperationCallback;
import com.ait.toolkit.sencha.shared.client.util.Filter;
import com.ait.toolkit.sencha.shared.client.util.Sorter;

/**
 * Configuration options for an {@link Operation}
 */

// TODO Finish this
public class OperationConfig extends BaseConfig {

	public OperationConfig() {
		jsObj = JsoHelper.createObject();
	}

	public void setAction(String value) {
		JsoHelper.setAttribute(jsObj, "action", value);
	}

	public void setBatch(Batch value) {
		JsoHelper.setAttribute(jsObj, "batch", value.getJsObj());
	}

	public void setLimit(int value) {
		JsoHelper.setAttribute(jsObj, "limit", value);
	}

	public void setFilters(Filter... filters) {
		setFilters(Arrays.asList(filters));
	}

	public native void setFilters(List<Filter> filters)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.filters = @com.ait.toolkit.sencha.shared.client.util.Filter::fromList(Ljava/util/List;)(filters);
	}-*/;

	public void setSorters(Sorter... sorters) {
		setSorters(Arrays.asList(sorters));
	}

	public native void setSorters(List<Sorter> sorters)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.filters = @com.ait.toolkit.sencha.shared.client.util.Sorter::fromList(Ljava/util/List;)(sorters);
	}-*/;

	public native void setCallback(OperationCallback cb)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.callback = $entry(function(r, op, success) {
			var data = @com.ait.toolkit.data.client.BaseModel::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(op);
			cb.@com.ait.toolkit.sencha.shared.client.data.handlers.OperationCallback::onEvent(Ljava/util/List;Lcom/ait/toolkit/sencha/shared/client/data/Operation;Z)(data,operation,success);
		});
	}-*/;

}
