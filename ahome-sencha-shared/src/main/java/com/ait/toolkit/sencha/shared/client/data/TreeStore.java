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
package com.ait.toolkit.sencha.shared.client.data;

import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.TableItem;
import com.ait.toolkit.sencha.shared.client.data.proxy.ProxyConfig;
import com.ait.toolkit.sencha.shared.client.util.SorterConfig;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

/**
 * This class is used as a container for a series of nodes. The nodes themselves maintain the relationship between parent/child. The tree itself acts as a manager. It gives
 * functionality to retrieve a node by its identifier: getNodeById.
 * <p>
 * The tree also relays events from any of it's child nodes, allowing them to be handled in a centralized fashion. In general this class is not used directly, rather used
 * internally by other parts of the framework.
 */
public class TreeStore extends Store {

	private TreeStore() {
		create();
	}

	public TreeStore(List<? extends TableItem> data) {
		this(data, false, "text");
	}

	public TreeStore(List<? extends TableItem> data, String... fields) {
		this(data, false, fields);
	}

	public TreeStore(List<? extends TableItem> data, boolean expanded, String... fields) {
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];
		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}
		JsArrayString fs = JsArray.createArray().cast();
		for (String s : fields) {
			fs.push(s);
		}
		create(JsoHelper.arrayConvert(storeData), fs, expanded);
	}

	public TreeStore(List<? extends TableItem> data, SorterConfig... sorters) {
		this(data, false, sorters);
	}

	public TreeStore(List<? extends TableItem> data, List<String> fields, SorterConfig... sorters) {
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];
		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}
		JsArrayString fs = JsArrayString.createArray().cast();
		for (String s : fields) {
			fs.push(s);
		}
		create(JsoHelper.arrayConvert(storeData), fs, false, JsoHelper.arrayConvert(sorters));
	}

	public TreeStore(List<? extends TableItem> data, boolean expanded) {
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];
		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}
		create(JsoHelper.arrayConvert(storeData), expanded);
	}

	public TreeStore(List<? extends TableItem> data, boolean expanded, SorterConfig... sorters) {
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];
		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}
		JsArrayString fields = JsArrayString.createArray().cast();
		fields.push("text");
		create(JsoHelper.arrayConvert(storeData), fields, expanded, JsoHelper.arrayConvert(sorters));
	}

	public TreeStore(ProxyConfig proxy, TableItem root) {
		create(proxy, root);
	}

	public TreeStore(JavaScriptObject obj) {
		super(obj);
	}

	public void setRootNode(TableItem model) {
		setRootNode(model.getJsObj());
	}

	private native void create()/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore();
	}-*/;

	private native void create(JavaScriptObject values, boolean isExpanded)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore(
				{
					root : {
						expanded : isExpanded,
						children : values
					}
				});

	}-*/;

	private native void create(JavaScriptObject values, JavaScriptObject fs, boolean isExpanded, JavaScriptObject sortersConfig)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore(
				{
					fields : fs,
					root : {
						expanded : isExpanded,
						children : values,
						sorters : sortersConfig
					}
				});

	}-*/;

	private native void create(ProxyConfig storeProxyConfig, TableItem root)/*-{
		var peer = storeProxyConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var rootPeer = root.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore(
				{
					proxy : peer,
					root : rootPeer
				});
	}-*/;

	private native void create(ProxyConfig storeProxyConfig, TableItem root, JavaScriptObject storeSorters)/*-{
		var peer = storeProxyConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var rootPeer = root.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore(
				{
					proxy : peer,
					root : rootPeer,
					sorters : storeSorters
				});
	}-*/;

	private native void setRootNode(JavaScriptObject node)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.setRootNode(node);
	}-*/;

	private native void create(JavaScriptObject values, JavaScriptObject fs, boolean isExpanded)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.TreeStore(
				{
					fields : fs,
					root : {
						expanded : isExpanded,
						children : values
					}
				});

	}-*/;

}
