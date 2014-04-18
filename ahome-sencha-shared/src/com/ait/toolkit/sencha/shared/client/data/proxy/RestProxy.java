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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.data.reader.Reader;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * AjaxProxy is one of the most widely-used ways of getting data into your
 * application. It uses AJAX requests to load data from the server, usually to
 * be placed into a Store.
 * 
 */
public class RestProxy extends AjaxProxy {

	public RestProxy(String url) {
		JavaScriptObject obj = JsoHelper.createObject();
		JsoHelper.setAttribute(obj, "url", url);
	}

	public RestProxy(String url, Reader reader) {
		JavaScriptObject obj = JsoHelper.createObject();
		JsoHelper.setAttribute(obj, "url", url);
		JsoHelper.setAttribute(obj, "reader", reader.getJsObj());
		jsObj = createPeer(obj);
	}

	public RestProxy(ProxyConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	private native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.data.proxy.Rest(config);
	}-*/;

}
