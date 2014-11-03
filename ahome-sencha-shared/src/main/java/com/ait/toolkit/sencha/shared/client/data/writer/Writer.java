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

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base Writer class used by most subclasses of Ext.data.proxy.Server. This
 * class is responsible for taking a set of Ext.data.Operation objects and a
 * Ext.data.Request object and modifying that request based on the Operations.
 * <p>
 * For example a Ext.data.writer.Json would format the Operations and their
 * Ext.data.Model instances based on the config options passed to the
 * JsonWriter's constructor.
 * <p>
 * s Writers are not needed for any kind of local storage - whether via a Web
 * Storage proxy (see localStorage and sessionStorage) or just in memory via a
 * MemoryProxy.
 * 
 */
public class Writer extends JsObject {

	public Writer() {
		jsObj = createPeer();
	}

	public Writer(WriterConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	public Writer(JavaScriptObject peer) {
		jsObj = peer;
	}

	private native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.data.Writer(config);
	}-*/;

	private native JavaScriptObject createPeer()/*-{
		return new $wnd.Ext.data.Writer();
	}-*/;

}
