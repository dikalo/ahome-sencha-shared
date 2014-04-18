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

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class JsonWriterConfig extends WriterConfig {

    public JsonWriterConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setAllowSingle(boolean value) {
        JsoHelper.setAttribute(jsObj, "allowSingle", value);
    }

    public void setEncode(boolean value) {
        JsoHelper.setAttribute(jsObj, "encode", value);
    }

    public void setExpandData(boolean value) {
        JsoHelper.setAttribute(jsObj, "expandData", value);
    }

    public void setRoot(String value) {
        JsoHelper.setAttribute(jsObj, "root", value);
    }

    public JsonWriterConfig(JavaScriptObject peer) {
        jsObj = peer;
    }
}
