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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.data.client.Bean;
import com.ait.toolkit.sencha.shared.client.core.ExtCore;
import com.ait.toolkit.sencha.shared.client.data.proxy.ProxyConfig;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class ArrayStore extends Store {

	protected ArrayStore() {
		// create();
	}

	public ArrayStore(String modelName, ProxyConfig proxy) {
		create(modelName, proxy);
	}

	/**
	 * This constructor allows a Store to be created; it MUST contain at least
	 * one element, since the Store's fields will be derived from the first
	 * element in the Store.
	 * 
	 * @param data
	 */
	public ArrayStore(List<? extends BaseModel> data) {
		assert !data.isEmpty() : "BaseModel list cannot be empty.";
		Set<String> fields = new HashSet<String>(data.get(0).getFields());
		initStore(data, fields);
	}

	public ArrayStore(Object[] data, FieldDefinition... fields) {
		assert data != null : "Data cant be null";
		assert fields.length > 0 : "Fields cannot be empty.";
		create(JsoHelper.convertToJavaScriptArray(data),
				JsoHelper.convertToJavaScriptArray(fields));
	}

	public ArrayStore(Object[] data, String... fields) {
		assert data != null : "Data cant be null";
		assert fields.length > 0 : "Fields cannot be empty.";
		create(JsoHelper.convertToJavaScriptArray(data),
				JsoHelper.convertToJavaScriptArray(fields));
	}

	public static ArrayStore from(List<? extends Bean> beans) {
		List<BaseModel> models = new ArrayList<BaseModel>();
		for (Bean bean : beans) {
			models.add(BaseModel.from(bean.getJsObj()));
		}
		return new ArrayStore(models);
	}

	public ArrayStore(List<? extends BaseModel> data, ProxyConfig proxy) {
		assert !data.isEmpty() : "BaseModel list cannot be empty.";
		Set<String> fields = new HashSet<String>(data.get(0).getFields());
		initStore(data, fields, proxy);
	}

	/**
	 * This constructor allows a Store to be created without elements. However,
	 * the list of fields must be specified.
	 * 
	 * @param data
	 * @param fields
	 */
	public ArrayStore(List<? extends BaseModel> data, String... fields) {
		assert fields.length != 0 : "Fields list cannot be empty.";
		initStore(data, new HashSet<String>(Arrays.asList(fields)));
	}

	public ArrayStore(List<? extends BaseModel> data, ProxyConfig proxy,
			String... fields) {
		assert fields.length != 0 : "Fields list cannot be empty.";
		initStore(data, new HashSet<String>(Arrays.asList(fields)), proxy);
	}

	public ArrayStore(JavaScriptObject obj) {
		super(obj);
	}

	public static ArrayStore instance(JavaScriptObject obj) {
		return new ArrayStore(obj);
	}

	/**
	 * initStoreializes this Store with the given BaseModel objects and the
	 * given fields.
	 * 
	 * @param data
	 * @param fields
	 */

	protected void initStore(List<? extends BaseModel> data, Set<String> fields) {
		modelRegistry++;
		modelName = model + modelRegistry;
		this.elements.addAll(data);

		ExtCore.defineModel(modelName, fields);
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];

		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}

		create(modelName, JsoHelper.arrayConvert(storeData));
	}

	protected void initStore(Object[] data, Set<String> fields) {
		modelRegistry++;
		modelName = model + modelRegistry;
		ExtCore.defineModel(modelName, fields);
		create(modelName, JsoHelper.convertToJavaScriptArray(data));
	}

	protected void initStore(List<? extends BaseModel> data,
			Set<String> fields, ProxyConfig proxy) {
		modelRegistry++;
		modelName = model + modelRegistry;
		this.elements.addAll(data);

		ExtCore.defineModel(modelName, fields);
		JavaScriptObject[] storeData = new JavaScriptObject[data.size()];

		for (int i = 0; i < data.size(); i++) {
			storeData[i] = data.get(i).getJsObj();
		}

		create(modelName, JsoHelper.arrayConvert(storeData), proxy);
	}

	private native void create(String modelName, JavaScriptObject values)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.ArrayStore(
				{
					model : modelName,
					data : values
				});
	}-*/;

	private native void create(String modelName, JavaScriptObject values,
			ProxyConfig storeProxyConfig)/*-{
		var peer = storeProxyConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.ArrayStore(
				{
					model : modelName,
					data : values,
					proxy : peer
				});
	}-*/;

	private native void create(String modelName, ProxyConfig storeProxyConfig)/*-{
		var peer = storeProxyConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.ArrayStore(
				{
					model : modelName,
					proxy : peer
				});
	}-*/;

	private native void create(JavaScriptObject dataValue,
			JavaScriptObject fieldsValue)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.ArrayStore(
				{
					data : dataValue,
					fields : fieldsValue
				});
	}-*/;

}
