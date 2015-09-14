package com.ait.toolkit.sencha.shared.client.dom;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class ElementAttribute extends JsObject {

    public ElementAttribute() {
        jsObj = JsoHelper.createObject();
    }

    public void setAttribute( String attribute, String value ) {
        JsoHelper.setAttribute( jsObj, attribute, value );
    }
}
