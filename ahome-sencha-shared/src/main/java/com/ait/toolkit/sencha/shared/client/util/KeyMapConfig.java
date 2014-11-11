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
import com.ait.toolkit.sencha.shared.client.core.handlers.KeyListener;

/**
 * KeyMap configuration class.
 * 
 * @author Alain Ekambi
 */
public class KeyMapConfig extends BaseConfig {

	public KeyMapConfig() {
	}

	/**
	 * The keycode to handle.
	 * 
	 * @param keyCode
	 *            the keycode
	 */
	public KeyMapConfig(int keyCode) {
		JsoHelper.setAttribute(jsObj, "key", keyCode);
	}

	/**
	 * An array of keycodes to handle.
	 * 
	 * @param keyCodes
	 *            keycodes
	 */
	public KeyMapConfig(int[] keyCodes) {
		JsoHelper.setAttribute(jsObj, "key",
				JsoHelper.convertToJavaScriptArray(keyCodes));
	}

	/**
	 * A list of keys to handle.
	 * 
	 * @param keys
	 *            the keys to handles
	 */
	public KeyMapConfig(String keys) {
		JsoHelper.setAttribute(jsObj, "key", keys);
	}

	/**
	 * The keycode to handle.
	 * 
	 * @param key
	 *            the keycode
	 */
	public void setKey(int key) {
		JsoHelper.setAttribute(jsObj, "key", key);
	}

	/**
	 * A list of keys to handle.
	 * 
	 * @param keys
	 *            the keys to handles
	 */
	public void setKey(String keys) {
		JsoHelper.setAttribute(jsObj, "key", keys);
	}

	/**
	 * An array of keycodes to handle.
	 * 
	 * @param keyCodes
	 *            keycodes
	 */
	public void setKey(int[] keyCodes) {
		JsoHelper.setAttribute(jsObj, "key",
				JsoHelper.convertToJavaScriptArray(keyCodes));
	}

	/**
	 * True to handle key only when ctrl is pressed (defaults to false).
	 * 
	 * @param ctrl
	 *            true to handle ctrl
	 */
	public void setCtrl(boolean ctrl) {
		JsoHelper.setAttribute(jsObj, "ctrl", ctrl);
	}

	/**
	 * True to handle key only when alt is pressed (defaults to false).
	 * 
	 * @param alt
	 *            true to handle alt
	 */
	public void setAlt(boolean alt) {
		JsoHelper.setAttribute(jsObj, "alt", alt);
	}

	/**
	 * True to handle key only when shift is pressed (defaults to false)
	 * 
	 * @param shift
	 *            true to handle shift
	 */
	public void setShift(boolean shift) {
		JsoHelper.setAttribute(jsObj, "shift", shift);
	}

	/**
	 * The listener to call when KeyMap finds the expected key combination.
	 * 
	 * @param listener
	 *            the listener
	 */
	public native void setKeyListener(KeyListener listener) /*-{
		var config = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		config['fn'] = function(key, event) {
			var e = @com.ait.toolkit.sencha.shared.client.core.EventObject::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
			listener.@com.ait.toolkit.sencha.shared.client.core.handlers.KeyListener::onKey(ILcom/ait/toolkit/sencha/shared/client/core/EventObject;)(key,e);
		};
	}-*/;
}
