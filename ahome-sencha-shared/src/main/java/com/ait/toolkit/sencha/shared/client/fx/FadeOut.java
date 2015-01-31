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

import com.ait.toolkit.core.client.JsoHelper;

public class FadeOut extends Animation {

	public FadeOut() {

	}

	public FadeOut(int duration) {
		this();
		setDuration(duration);
	}

	public FadeOut(int duration, Easing easing) {
		this(duration);
		setEasing(easing);
	}

	public void setDuration(int value) {
		JsoHelper.setAttribute(jsObj, "duration", value);
	}

	public void setRemove(boolean value) {
		JsoHelper.setAttribute(jsObj, "remove", value);
	}

	public void setUseDisplay(boolean value) {
		JsoHelper.setAttribute(jsObj, "useDisplay", value);
	}

}
