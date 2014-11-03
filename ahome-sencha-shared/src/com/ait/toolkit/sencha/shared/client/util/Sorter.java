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

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Represents a single grouper that can be applied to a Store
 */
public class Sorter extends JsObject {

	Sorter() {

	}

	public Sorter(JavaScriptObject obj) {
		jsObj = obj;
	}

	public Sorter(String property, Direction direction) {
		jsObj = create(property, direction.getValue());
	}

	public Sorter(SorterConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	public void setProperty(String value) {
		JsoHelper.setAttribute(getJsObj(), "property", value);
	}

	public static JsArray<JavaScriptObject> fromList(List<Sorter> filters) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Sorter filter : filters) {
			values.push(filter.getJsObj());
		}
		return values;
	}

	public static List<Sorter> fromJsArray(JavaScriptObject array) {
		List<Sorter> toReturn = new ArrayList<Sorter>();
		int size = JsoHelper.getArrayLength(array);
		for (int i = 0; i < size; i++) {
			JavaScriptObject peer = JsoHelper
					.getValueFromJavaScriptObjectArray(array, i);
			toReturn.add(new Sorter(peer));
		}
		return toReturn;
	}

	public void setDirection(Direction dir) {
		_setDirection(dir.getValue());
	}

	public native void toggle()/*-{
		var s = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		s.toggle();
	}-*/;

	private native void _setDirection(String value)/*-{
		var s = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		s.setDirection(value);
	}-*/;

	private native JavaScriptObject create(String prop, String d)/*-{
		return new $wnd.Ext.util.Sorter({
			property : prop,
			direction : d
		});
	}-*/;

	private native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.util.Sorter(config);
	}-*/;
}
