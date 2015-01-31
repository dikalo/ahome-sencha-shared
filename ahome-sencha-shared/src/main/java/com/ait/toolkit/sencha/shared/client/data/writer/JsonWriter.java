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
package com.ait.toolkit.sencha.shared.client.data.writer;

import com.google.gwt.core.client.JavaScriptObject;

public class JsonWriter extends Writer {

	public JsonWriter() {
		jsObj = createPeer();
	}

	public JsonWriter(WriterConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	public JsonWriter(JavaScriptObject peer) {
		jsObj = peer;
	}

	private native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.data.Json(config);
	}-*/;

	private native JavaScriptObject createPeer()/*-{
		return new $wnd.Ext.data.Writer();
	}-*/;

}
