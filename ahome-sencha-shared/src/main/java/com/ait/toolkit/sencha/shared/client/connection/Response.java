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
package com.ait.toolkit.sencha.shared.client.connection;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The XMLHttpRequest object containing the response data. See
 * www.w3.org/TR/XMLHttpRequest/ for details about accessing elements of the
 * response.
 */
public class Response extends JsObject {

	protected Response(JavaScriptObject obj) {
		jsObj = obj;
	}

	public String getResponseText() {
		return JsoHelper.getAttribute(jsObj, "responseText");
	}

	public String getResponseXml() {
		return JsoHelper.getAttribute(jsObj, "responseXml");
	}

	public int getStatusCode() {
		return JsoHelper.getAttributeAsInt(jsObj, "status");
	}

	public int getStatusText() {
		return JsoHelper.getAttributeAsInt(jsObj, "statusText");
	}

}
