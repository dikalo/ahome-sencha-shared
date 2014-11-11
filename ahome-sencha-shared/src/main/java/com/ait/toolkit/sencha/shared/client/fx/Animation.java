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
package com.ait.toolkit.sencha.shared.client.fx;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.core.config.BaseConfig;

public class Animation extends BaseConfig {

	public Animation() {

	}

	public Animation(int duration) {
		this();
		setDuration(duration);
	}

	public Animation(int duration, Easing easing) {
		this(duration);
		setEasing(easing);
	}

	public void setDuration(int value) {
		JsoHelper.setAttribute(jsObj, "duration", value);
	}

	public void setEasing(Easing easing) {
		setEasing(easing.getValue());
	}

	private void setEasing(String value) {
		JsoHelper.setAttribute(jsObj, "easing", value);
	}

	public native Animation setCallback(Function callback)/*-{
		var obj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		obj.callback = $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
		return this;
	}-*/;

}
