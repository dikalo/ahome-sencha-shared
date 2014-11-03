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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Specific urls to call on CRUD action methods "create", "read", "update" and
 * "destroy".
 */
public class ProxyApi extends JsObject {
    public ProxyApi() {
        jsObj = JsoHelper.createObject();
    }

    public void setCreate(String value) {
        JsoHelper.setAttribute(jsObj, "create", value);
    }

    public void setRead(String value) {
        JsoHelper.setAttribute(jsObj, "read", value);
    }

    public void setUpdate(String value) {
        JsoHelper.setAttribute(jsObj, "update", value);
    }

    public void setDestroyCreate(String value) {
        JsoHelper.setAttribute(jsObj, "destroy", value);
    }
}
