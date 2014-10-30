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
package com.ait.toolkit.sencha.shared.client.data.proxy;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.shared.client.data.Operation;
import com.ait.toolkit.sencha.shared.client.data.reader.Reader;
import com.ait.toolkit.sencha.shared.client.data.writer.Writer;

/**
 * Proxies are used by Stores to handle the loading and saving of DataModel
 * data. Usually developers will not need to create or interact with proxies
 * directly.
 */
public abstract class Proxy extends JsObject {

	public void setType(String value) {
		JsoHelper.setAttribute(jsObj, "type", value);
	}

	public native void create(Operation operation, ActionCallback callback)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.create(
						operation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(op) {
							var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(op);
							callback.@com.ait.toolkit.sencha.shared.client.data.proxy.ActionCallback::onAction(Lcom/ait/toolkit/sencha/shared/client/data/Operation;)(operation);
						}));
	}-*/;

	public native void destroy(Operation operation, ActionCallback callback)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.destroy(
						operation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(op) {
							var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(op);
							callback.@com.ait.toolkit.sencha.shared.client.data.proxy.ActionCallback::onAction(Lcom/ait/toolkit/sencha/shared/client/data/Operation;)(operation);
						}));
	}-*/;

	public native BaseModel getModel()/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = proxy.getModel();
		return @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native Reader getReader()/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = proxy.getReader();
		return @com.ait.toolkit.sencha.shared.client.data.reader.Reader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native Writer getWriter()/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = proxy.getReader();
		return @com.ait.toolkit.sencha.shared.client.data.writer.Writer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void read(Operation operation, ActionCallback callback)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.read(
						operation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(op) {
							var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(op);
							callback.@com.ait.toolkit.sencha.shared.client.data.proxy.ActionCallback::onAction(Lcom/ait/toolkit/sencha/shared/client/data/Operation;)(operation);
						}));
	}-*/;

	public native void read(Operation operation)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.read(
				operation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				$entry(function() {

				}));
	}-*/;

	public native void update(Operation operation, ActionCallback callback)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.update(
						operation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						$entry(function(op) {
							var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(op);
							callback.@com.ait.toolkit.sencha.shared.client.data.proxy.ActionCallback::onAction(Lcom/ait/toolkit/sencha/shared/client/data/Operation;)(operation);
						}));
	}-*/;

	public native void setModel(BaseModel model, boolean setOnStore)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.setModel(
				model.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				setOnStore);
	}-*/;

	public native void setModel(String model, boolean setOnStore)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy.setModel(model, setOnStore);
	}-*/;

	public native void setReader(Reader reader)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.setReader(reader.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void setWriter(Writer writer)/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		proxy
				.setReader(writer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native String getMethod()/*-{
		var proxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return proxy.getMethod();
	}-*/;

	// TODO MetaChancge Event

}
