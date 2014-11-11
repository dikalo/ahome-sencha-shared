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
package com.ait.toolkit.sencha.shared.client.core;

import com.ait.toolkit.core.client.Attribute;
import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Config object that can listen to events
 */
public abstract class ObservableJso extends JsObject {

	public ObservableJso() {
		jsObj = JsoHelper.createObject();
	}

	public void set(Attribute property, Object value) {
		JsoHelper.setAttribute(jsObj, property.getValue(), value);
	}

	public void set(String property, Object value) {
		JsoHelper.setAttribute(jsObj, property, value);
	}

	public void set(String property, double value) {
		JsoHelper.setAttribute(jsObj, property, value);
	}

	public void set(Attribute property, double value) {
		JsoHelper.setAttribute(jsObj, property.getValue(), value);
	}

	public void set(String property, boolean value) {
		JsoHelper.setAttribute(jsObj, property, value);
	}

	public void set(Attribute property, boolean value) {
		JsoHelper.setAttribute(jsObj, property.getValue(), value);
	}

	/**
	 * Appends an event handler to this object.
	 * 
	 * @param event
	 *            , The name of the event to listen for
	 * @param fn
	 *            , the function to call when the event occurs
	 */
	public native void addListener(String event, Function fn)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.addListener(event, $entry(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		}));
	}-*/;

	/**
	 * Removes all listeners for this object including the managed listeners
	 */
	public native void clearListeners()/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.clearListeners();
	}-*/;

}
