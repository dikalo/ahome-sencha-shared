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
package com.ait.toolkit.sencha.shared.client.core;

import java.util.Set;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.sencha.shared.client.dom.CompositeElement;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;

public class ExtCore {

	protected ExtCore() {

	}

	public static final String AIT_MAIN_EXT_THEME_ID = "ait-app-theme";
	public static final String AIT_MAIN_EXT_JS_ID = "ait-js-id";

	/**
	 * URL to a blank file used by Ext when in secure mode for iframe src and onReady src to prevent the IE insecure content warning (defaults to javascript:false).
	 * 
	 * @param url
	 *            the url
	 */
	public static native void setSslSecureUrl(String url)/*-{
		$wnd.Ext.SSL_SECURE_URL = url;
	}-*/;

	/**
	 * he current version of IE (0 if the browser is not IE). This does not account for the documentMode of the current page, which is factored into isIE7, isIE8 and isIE9.
	 * 
	 * @return
	 */
	public static native int getIeVersion()/*-{
		return $wnd.Ext.ieVersion;
	}-*/;

	/**
	 * Sets the default font-family to use for components that support a glyph config.
	 */
	public static native void setGlyphFontFamily(String value)/*-{
		$wnd.Ext.setGlyphFontFamily(value);
	}-*/;

	/**
	 * Indicates whether to use native browser parsing for JSON methods. This option is ignored if the browser does not support native JSON methods.
	 * <p>
	 * Note: Native JSON methods will not work with objects that have functions. Also, property names must be quoted, otherwise the data will not parse.
	 * <p>
	 * Defaults to: false*
	 */
	public static native void setUseNativeJson(boolean useNativeJson)/*-{
		$wnd.Ext.USE_NATIVE_JSON = useNativeJson;
	}-*/;

	/**
	 * Indicates whether to use native browser parsing for JSON methods. This option is ignored if the browser does not support native JSON methods.
	 * <p>
	 * Note: Native JSON methods will not work with objects that have functions. Also, property names must be quoted, otherwise the data will not parse.
	 * <p>
	 * Defaults to: false*
	 */
	public static native boolean useNativeJson()/*-{
		return $wnd.Ext.USE_NATIVE_JSON;
	}-*/;

	/**
	 * True if the Ext.fx.Anim Class is available.
	 */
	public static native boolean isFxEnabled()/*-{
		return $wnd.Ext.enableFx;
	}-*/;

	/**
	 * The current version of Chrome (0 if the browser is not Chrome).
	 */
	public static native double getChromeVersion()/*-{
		return $wnd.Ext.chromeVersion;
	}-*/;

	/**
	 * True to automatically uncache orphaned Ext.Elements periodically (defaults to true).
	 * 
	 * @param enableGarbageCollector
	 *            true to enable GC
	 */
	public static native void setEnableGarbageCollector(boolean enableGarbageCollector)/*-{
		$wnd.Ext.enableGarbageCollector = enableGarbageCollector;
	}-*/;

	/**
	 * Returns is Garbage Collector is enabled.
	 * 
	 * @return true if GC enabled
	 */
	public static native boolean isEnableGarbageCollector()/*-{
		return $wnd.Ext.enableGarbageCollector;
	}-*/;

	/**
	 * True to automatically purge event listeners after uncaching an element (defaults to false). Note: this only happens if enableGarbageCollector is true.
	 * 
	 * @param enableListenerCollection
	 *            true to enable listener collection
	 */
	public static native void setEnableListenerCollection(boolean enableListenerCollection)/*-{
		$wnd.Ext.enableListenerCollection = enableListenerCollection;
	}-*/;

	/**
	 * Retruns true if listener collection is true.
	 * 
	 * @return true if listener collection is enabled
	 */
	public static native boolean isEnableListenerCollection()/*-{
		return $wnd.Ext.enableListenerCollection;
	}-*/;

	/**
	 * @return true if bodex box
	 */
	public static native boolean isBorderBox()/*-{
		return $wnd.Ext.isBorderBox;
	}-*/;

	/**
	 * The current version of Firefox (0 if the browser is not Firefox).
	 * 
	 * @return
	 */
	public static native double getFirefoxVersion()/*-{
		return $wnd.Ext.firefoxVersion;
	}-*/;

	/**
	 * The current version of IE (0 if the browser is not Firefox).
	 * 
	 * @return
	 */
	public static native double geIEVersion()/*-{
		return $wnd.Ext.ieVersion;
	}-*/;

	/**
	 * True if the detected browser is Chrome.
	 * 
	 * @return
	 */
	public static native boolean isChrome()/*-{
		return $wnd.Ext.isChrome;
	}-*/;

	/**
	 * True if the detected browser uses FireFox 10
	 * 
	 * @return
	 */
	public static native boolean isFF10()/*-{
		return $wnd.Ext.isFF10;
	}-*/;

	/**
	 * T rue if the detected browser uses FireFox 3.0
	 * 
	 * @return
	 */
	public static native boolean isFF3_0()/*-{
		return $wnd.Ext.isFF3_0;
	}-*/;

	/**
	 * T rue if the detected browser uses FireFox 3.5
	 * 
	 * @return
	 */
	public static native boolean isFF3_5()/*-{
		return $wnd.Ext.isFF3_5;
	}-*/;

	/**
	 * True if the detected browser uses FireFox 3.5
	 * 
	 * @return
	 */
	public static native boolean isFF3_6()/*-{
		return $wnd.Ext.isFF3_6;
	}-*/;

	/**
	 * True if the detected browser uses FireFox 4
	 * 
	 * @return
	 */
	public static native boolean isFF4()/*-{
		return $wnd.Ext.isFF4;
	}-*/;

	/**
	 * True if the detected browser uses FireFox 4
	 * 
	 * @return
	 */
	public static native boolean isFF5()/*-{
		return $wnd.Ext.isFF5;
	}-*/;

	/**
	 * True if the detected browser uses the Gecko layout engine (e.g. Mozilla, Firefox).
	 */
	public static native boolean isGecko()/*-{
		return $wnd.Ext.isGecko;
	}-*/;

	/**
	 * True if the detected browser uses a Gecko 5.0+ layout engine (e.g. Firefox 5.x).
	 */
	public static native boolean isGecko10()/*-{
		return $wnd.Ext.isGecko10;
	}-*/;

	public static native boolean isGecko3()/*-{
		return $wnd.Ext.isGecko3;
	}-*/;

	public static native boolean isGecko4()/*-{
		return $wnd.Ext.isGecko4;
	}-*/;

	public static native boolean isGecko5()/*-{
		return $wnd.Ext.isGecko5;
	}-*/;

	/**
	 * @return true if IE
	 */
	public static native boolean isIE()/*-{
		return $wnd.Ext.isIE;
	}-*/;

	public static native boolean isIE10()/*-{
		return $wnd.Ext.isIE10;
	}-*/;

	public static native boolean isIE10m()/*-{
		return $wnd.Ext.isIE10m;
	}-*/;

	public static native boolean isIE10p()/*-{
		return $wnd.Ext.isIE10p;
	}-*/;

	public static native boolean isIE11()/*-{
		return $wnd.Ext.isIE11;
	}-*/;

	public static native boolean isIE11m()/*-{
		return $wnd.Ext.isIE11m;
	}-*/;

	public static native boolean isIE11p()/*-{
		return $wnd.Ext.isIE11p;
	}-*/;

	/**
	 * @return true if IE6
	 */
	public static native boolean isIE6()/*-{
		return $wnd.Ext.isIE6;
	}-*/;

	/**
	 * @return true if IE7
	 */
	public static native boolean isIE7()/*-{
		return $wnd.Ext.isIE7;
	}-*/;

	public static native boolean isIE7m()/*-{
		return $wnd.Ext.isIE7m;
	}-*/;

	public static native boolean isIE7p()/*-{
		return $wnd.Ext.isIE7p;
	}-*/;

	public static native boolean isIE8()/*-{
		return $wnd.Ext.isIE8;
	}-*/;

	public static native boolean isIE8m()/*-{
		return $wnd.Ext.isIE8m;
	}-*/;

	public static native boolean isIE8p()/*-{
		return $wnd.Ext.isIE8p;
	}-*/;

	public static native boolean isIE9()/*-{
		return $wnd.Ext.isIE9;
	}-*/;

	public static native boolean isIE9m()/*-{
		return $wnd.Ext.isIE9m;
	}-*/;

	public static native boolean isIE9p()/*-{
		return $wnd.Ext.isIE9p;
	}-*/;

	/**
	 * @return true if Linux OS
	 */
	public static native boolean isLinux()/*-{
		return $wnd.Ext.isLinux;
	}-*/;

	/**
	 * @return true if Mac
	 */
	public static native boolean isMac()/*-{
		return $wnd.Ext.isMac;
	}-*/;

	/**
	 * @return true if running under Adobe AIR
	 */
	public static native boolean isAir()/*-{
		return $wnd.Ext.isAir;
	}-*/;

	/**
	 * @return true if Opera
	 */
	public static native boolean isOpera()/*-{
		return $wnd.Ext.isOpera;
	}-*/;

	public static native boolean isOpera10_5()/*-{
		return $wnd.Ext.isOpera10_5;
	}-*/;

	/**
	 * @return true when the document is fully initialized and ready for action
	 */
	public static native boolean isReady()/*-{
		return $wnd.Ext.isReady;
	}-*/;

	/**
	 * @return true if Safari
	 */
	public static native boolean isSafari()/*-{
		return $wnd.Ext.isSafari;
	}-*/;

	/**
	 * @return true if Safari 2
	 */
	public static native boolean isSafari2()/*-{
		return $wnd.Ext.isSafari2;
	}-*/;

	/**
	 * @return true if Safari 3
	 */
	public static native boolean isSafari3()/*-{
		return $wnd.Ext.isSafari3;
	}-*/;

	public static native boolean isSafari4()/*-{
		return $wnd.Ext.isSafari4;
	}-*/;

	public static native boolean isSafari5()/*-{
		return $wnd.Ext.isSafari5;
	}-*/;

	public static native boolean isSafari5_0()/*-{
		return $wnd.Ext.isSafari5_0;
	}-*/;

	/**
	 * @return true if the page is running over SSL
	 */
	public static native boolean isSecure()/*-{
		return $wnd.Ext.isSecure;
	}-*/;

	/**
	 * @return true if the browser is in strict mode
	 */
	public static native boolean isStrict()/*-{
		return $wnd.Ext.isStrict;
	}-*/;

	/**
	 * @return true if Windows OS
	 */
	public static native boolean isWindows()/*-{
		return $wnd.Ext.isWindows;
	}-*/;

	public static native boolean isWebKit()/*-{
		return $wnd.Ext.isWebKit;
	}-*/;

	/**
	 * By default, Ext intelligently decides whether floating elements should be shimmed. If you are using flash, you may want to set this to true.
	 * 
	 * @param useShims
	 *            true to use shims
	 */
	public static native void setUseShims(boolean useShims)/*-{
		$wnd.Ext.useShims = useShims;
	}-*/;

	/**
	 * @return true if use shims.
	 */
	public static native boolean isUseShims()/*-{
		return $wnd.Ext.useShims;
	}-*/;

	/**
	 * Escapes the passed string for use in a regular expression.
	 * 
	 * @param str
	 *            the String to escape
	 * @return escaped String
	 */
	public static native String escapeRe(String str)/*-{
		return $wnd.Ext.escapeRe(str);
	}-*/;

	// made package protected. Users don't need to call this anymore since it is
	// handled internally on
	// applicaiotn startup.
	native static void setBlankImageUrl(String url) /*-{
		$wnd.Ext.BLANK_IMAGE_URL = url;
	}-*/;

	/**
	 * Method to retrieve Element objects. Uses simple caching to consistently return the same object. Automatically fixes if an object was recreated with the same id via AJAX or
	 * DOM.
	 * 
	 * @param id
	 *            element ID
	 * @return the element
	 */
	public static native ExtElement get(String id) /*-{
		var el = $wnd.Ext.get(id);
		return el == null || el === undefined ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Method to retrieve Element objects. Uses simple caching to consistently return the same object. Automatically fixes if an object was recreated with the same id via AJAX or
	 * DOM.
	 * 
	 * @param element
	 *            the element
	 * @return the element
	 */
	public static native ExtElement get(Element element) /*-{
		var el = $wnd.Ext.get(element);
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Generates unique ids.
	 * 
	 * @return
	 */
	public static native String id() /*-{
		return $wnd.Ext.id();
	}-*/;

	/**
	 * Generates unique ids.
	 * 
	 * @return
	 */
	public static native String id(ExtElement element) /*-{
		return $wnd.Ext
				.id(element.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Generates unique ids.
	 * 
	 * @return
	 */
	public static native String id(ExtElement element, String prefix) /*-{
		return $wnd.Ext.id(
				element.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				prefix);
	}-*/;

	/**
	 * Attempts to destroy the objects by removing all event listeners, removing them from the DOM (if applicable) and calling their destroy functions (if available).
	 * 
	 * @param element
	 *            the element to destroy
	 */
	public static native void destroy(ExtElement element) /*-{
		var el = element.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.Ext
				.destroy(element.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Returns the current HTML document object as an {@link ExtElement}.
	 * 
	 * @return the document
	 */
	public static native ExtElement getDoc() /*-{
		var el = $wnd.Ext.getDoc();
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Returns the current orientation of the mobile device
	 */
	public static native String getOrientation()/*-{
		return $wnd.Ext.getOrientation();
	}-*/;

	/**
	 * Returns the size of the browser scrollbars. This can differ depending on operating system settings, such as the theme or font size.
	 */
	public static native Size getScrollbarSize()/*-{
		var obj = $wnd.Ext.getScrollbarSize();
		return @com.ait.toolkit.sencha.shared.client.core.Size::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Returns the size of the browser scrollbars. This can differ depending on operating system settings, such as the theme or font size.
	 */
	public static native Size getScrollbarSize(boolean force)/*-{
		var obj = $wnd.Ext.getScrollbarSize(force);
		return @com.ait.toolkit.sencha.shared.client.core.Size::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Returns the current document body as an{@link ExtElement}.
	 * 
	 * @return the document body
	 */
	public static native ExtElement getBody() /*-{
		var el = $wnd.Ext.getBody();
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Gets the globally shared flyweight ExtElement, with the passed node as the active element. Do not store a reference to this element - the dom node can be overwritten by
	 * other code.
	 * 
	 * @param id
	 *            the element ID
	 * @return the ExtElement
	 */
	public static native ExtElement fly(String id) /*-{
		var el = $wnd.Ext.fly(id);
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Gets the globally shared flyweight ExtElement, with the passed node as the active element. Do not store a reference to this element - the dom node can be overwritten by
	 * other code.
	 * 
	 * @param id
	 *            the element ID
	 * @param named
	 *            allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_internal")
	 * @return the ExtElement
	 */
	public static native ExtElement fly(String id, String named) /*-{
		var el = $wnd.Ext.fly(id, named);
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Gets the globally shared flyweight ExtElement, with the passed node as the active element. Do not store a reference to this element - the dom node can be overwritten by
	 * other code.
	 * 
	 * @param element
	 *            the element
	 * @return the ExtElement
	 */
	public static native ExtElement fly(Element element) /*-{
		var el = $wnd.Ext.fly(element);
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Gets the globally shared flyweight ExtElement, with the passed node as the active element. Do not store a reference to this element - the dom node can be overwritten by
	 * other code.
	 * 
	 * @param element
	 *            the element
	 * @param named
	 *            allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_internal")
	 * @return the ExtElement
	 */
	public static native ExtElement fly(Element element, String named) /*-{
		var el = $wnd.Ext.fly(element, named);
		return el == null ? null
				: @com.ait.toolkit.sencha.shared.client.dom.ExtElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(el);
	}-*/;

	/**
	 * Generates unique ids.
	 * 
	 * @return a unique ID
	 */
	public static native String generateId()/*-{
		return $wnd.Ext.id();
	}-*/;

	/**
	 * Generates unique ids.
	 * 
	 * @param prefix
	 *            Id prefix (defaults "ext-gen")
	 * @return a unique ID
	 */
	public static native String generateId(String prefix)/*-{
		return $wnd.Ext.id(null, prefix);
	}-*/;

	/**
	 * Fires when the document is ready (before onload and before images are loaded). Can alternatively use the GWT entry point mechanism.
	 * 
	 * @param cb
	 *            callback to execute
	 */
	public static native void onReady(Function cb) /*-{
		$wnd.Ext.onReady(function() {
			cb.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * Shorthand for the Ext.util.Observable.addListener method of the globalEvents Observable instance.
	 * 
	 * @param event
	 * @param cb
	 */
	public static native void on(String event, Function cb) /*-{
		$wnd.Ext.on(event, $entry(function() {
			cb.@com.ait.toolkit.core.client.Function::execute()();
		}));
	}-*/;

	public static void defineModel(String name, Set<String> fields) {
		JsArray<ModelFieldDefinition> fieldsDefinition = JsArray.createArray().cast();
		for (String s : fields) {
			fieldsDefinition.push(ModelFieldDefinition.create(s));
		}
		createModel(name, fieldsDefinition);

	}

	/**
	 * Copies all the properties of config to object if they don't already exist.
	 */
	public static native void applyIf(JsObject src, JsObject target)/*-{
		var s = src.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var t = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		$wnd.Ext.applyIf(s, t);
	}-*/;

	/**
	 * Formats a number using fixed-point notation
	 */
	public static native double toFixed(double value, double precision)/*-{
		return $wnd.Ext.Number.toFixed(value, precision);
	}-*/;

	/**
	 * Clone simple variables including array, {}-like objects, DOM nodes and Date without keeping the old reference. A reference for the object itself is returned if it's not a
	 * direct decendant of Object.
	 * 
	 * @param el
	 * @return
	 */
	public static native ExtElement cloneNode(ExtElement el)/*-{
		var node = $wnd.Ext
				.clone(el.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.sencha.shared.client.dom.ExtElement::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
	}-*/;

	public static native JavaScriptObject clone(JavaScriptObject el)/*-{
		return $wnd.Ext.clone(el);
	}-*/;

	/**
	 * Creates a CompositeElement for child nodes based on the passed CSS selector (the selector should not contain an id).
	 * 
	 * @param selector
	 *            the CSS selector
	 * @return the CompositeElement
	 */
	public static native CompositeElement select(String selector)/*-{
		var ceJS = $wnd.Ext.select(selector);
		return ceJS == null || ceJS === undefined ? null
				: @com.ait.toolkit.sencha.shared.client.dom.CompositeElement::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(ceJS);
	}-*/;

	/**
	 * Get the version number of the supplied package name; will return the last registered version (last Ext.setVersion call) if there's no package name given.
	 */
	public static native Version getVersion()/*-{
		var obj = $wnd.Ext.getVersion();
		return @com.ait.toolkit.sencha.shared.client.core.Version::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Get the version number of the supplied package name; will return the last registered version (last Ext.setVersion call) if there's no package name given.
	 */
	public static native Version getVersion(String packageName)/*-{
		var obj = $wnd.Ext.getVersion(packageName);
		return @com.ait.toolkit.sencha.shared.client.core.Version::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public static Version getExtVersion() {
		return getVersion("extjs");
	}

	public static Version getCoreVersion() {
		return getVersion("core");
	}

	public static native void error(String errorMessage)/*-{
		throw new Error(errorMessage);
	}-*/;

	public static native void dir(JavaScriptObject obj)/*-{
		if ($wnd.console) {
			$wnd.console.dir(obj);
		}
	}-*/;

	public static native void log(JavaScriptObject obj)/*-{
		if ($wnd.console) {
			$wnd.console.log(obj);
		}
	}-*/;

	public static native void dir(Object obj)/*-{
		if ($wnd.console) {
			$wnd.console.dir(obj);
		}
	}-*/;

	public static native void log(Object obj)/*-{
		if ($wnd.console) {
			$wnd.console.log(obj);
		}
	}-*/;

	public static void dir(JsObject obj) {
		dir(obj.getJsObj());
	}

	public static void log(JsObject obj) {
		log(obj.getJsObj());
	}

	private static native void createModel(String name, JsArray<ModelFieldDefinition> f)/*-{

		if ($wnd.Ext.versions.touch) {
			$wnd.Ext.define(name, {
				extend : 'Ext.data.Model',
				config : {
					fields : f
				}
			});
		} else {
			$wnd.Ext.define(name, {
				extend : 'Ext.data.Model',
				fields : f
			});
		}
	}-*/;

	public static native void createBoxPreview(JavaScriptObject parent, JavaScriptObject el)/*-{

		var parentSize = parent.getSize();
		var cloneWinMaxHeight = parentSize.height;
		var cloneWinMaxWidth = parentSize.width;
		var top = 0;
		var left = 0;

		var win = parent.createChild({
			tag : 'div'
		});
		win.setStyle('position', 'absolute');

		var top = 0;
		var left = 0;

		var b = el.dom.cloneNode(true);
		b.removeAttribute("id");
		var f = $wnd.Ext.get(b);

		var a = el.getSize();
		//$wnd.console.log(a);
		var d = cloneWinMaxWidth / a.width;

		left = ((a.width * d) / 2) - (a.width / 2);
		top = ((a.height * d) / 2) - (a.height / 2);
		d = Math.min(d, 1);
		f
				.setStyle("-webkit-transform", $wnd.Ext.String.format(
						"scale({0})", d));
		f.setStyle("-moz-transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("-o-transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("msTransform", $wnd.Ext.String.format("scale({0})", d));
		f.setLeftTop(left, top);
		f.removeCls("x-hide-offsets");
		win.appendChild(f);
		f.show();
	}-*/;

	public static native String getScreenContent(JavaScriptObject parent, JavaScriptObject el)/*-{

		var parentSize = parent.getSize();
		var cloneWinMaxHeight = parentSize.height;
		var cloneWinMaxWidth = parentSize.width;
		var top = 0;
		var left = 0;

		var win = parent.createChild({
			tag : 'div'
		});
		win.setStyle('position', 'absolute');

		var top = 0;
		var left = 0;

		var b = el.dom.cloneNode(true);
		b.removeAttribute("id");
		var f = $wnd.Ext.get(b);

		var a = el.getSize();
		//$wnd.console.log(a);
		var d = cloneWinMaxWidth / a.width;

		left = ((a.width * d) / 2) - (a.width / 2);
		top = ((a.height * d) / 2) - (a.height / 2);
		d = Math.min(d, 1);
		f
				.setStyle("-webkit-transform", $wnd.Ext.String.format(
						"scale({0})", d));
		f.setStyle("-moz-transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("-o-transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("transform", $wnd.Ext.String.format("scale({0})", d));
		f.setStyle("msTransform", $wnd.Ext.String.format("scale({0})", d));
		f.setLeftTop(left, top);
		f.removeCls("x-hide-offsets");

		win.appendChild(f);
		f.show();
		var body = f.dom.outerHTML;
		f.remove();
		//$wnd.console.log("innerHTML : " + s);

		var head = "<div style='position:absolute;left:" + left + "px;top:"
				+ top + "px;'>";
		var tail = "</div>";
		var toReturn = (head + body + tail);
		//$wnd.console.log(toReturn);
		return toReturn;
	}-*/;

}
