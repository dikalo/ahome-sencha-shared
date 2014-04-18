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

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.shared.client.data.proxy.ProxyConfig;
import com.ait.toolkit.sencha.shared.client.data.reader.JsonReader;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Small helper class to make creating {@link Store} from JSON data easier. A
 * JsonStore will be automatically configured with a {@link JsonReader}.
 */
public class JsonStore extends Store {

    protected JsonStore() {
        // create();
    }

    public JsonStore(ProxyConfig proxy, FieldDefinition... fields) {
        assert fields.length != 0 : "Fields list cannot be empty.";
        create(proxy.getJsObj(), JsoHelper.convertToJavaScriptArray(fields));
    }

    public JsonStore(JavaScriptObject obj) {
        super(obj);
    }

    public static JsonStore instance(JavaScriptObject obj) {
        return new JsonStore(obj);
    }

    private native void create(JavaScriptObject proxyConfig, JavaScriptObject fieldsValue)/*-{
		this.@com.ait.toolkit.core.client.JsObject::jsObj = new $wnd.Ext.data.JsonStore(
				{
					proxy : proxyConfig,
					fields : fieldsValue
				});
    }-*/;

}
