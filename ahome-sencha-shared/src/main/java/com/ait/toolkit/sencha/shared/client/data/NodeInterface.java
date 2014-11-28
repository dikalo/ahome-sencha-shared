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
import java.util.List;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.shared.client.data.handlers.NodeQueryHandler;
import com.ait.toolkit.sencha.shared.client.data.handlers.NodeSorter;
import com.ait.toolkit.sencha.shared.client.data.handlers.NodeTraversalCallback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * This class is used as a set of methods that are applied to the prototype of a DataModel to decorate it with a Node API. This means that models used in conjunction with a tree
 * will have all of the tree related methods available on the model. In general this class will not be used directly by the developer. This class also creates extra fields on the
 * model if they do not exist, to help maintain the tree state and UI. These fields are documented as config options.
 * 
 * @Since Ext4
 * 
 */
public class NodeInterface extends BaseModel {

	protected NodeInterface() {
		jsObj = JsoHelper.createObject();
	}

	protected NodeInterface(JavaScriptObject obj) {
		super(obj);
	}

	/**
	 * Bubbles up the tree from this node, calling the specified function with each node. The arguments to the function will be the args provided or the current node. If the
	 * function returns false at any point, the bubble is stopped.
	 * 
	 * @Since Ext4
	 * 
	 * @param handler
	 *            , the handler to be called when traversing each node
	 */
	public native void bubble(NodeTraversalCallback handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso
					.bubble($entry(function(node) {
						var nodeObject = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
						handler.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeTraversalCallback::onNodeTraverse(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(nodeObject);
					}));
		}

	}-*/;

	public native void collapseChildren()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapseChildren();
		}
	}-*/;

	public native void collapseChildren(boolean recursive)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapseChildren(recursive);
		}
	}-*/;

	public native void collapseChildren(boolean recursive, Function callback)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapseChildren(recursive, function() {
				callback.@com.ait.toolkit.core.client.Function::execute()();
			});
		}
	}-*/;

	public void collapseChildren(Function callback) {
		collapseChildren(false, callback);
	}

	public native NodeInterface copy()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			var o = jso.copy();
			return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
	}-*/;

	public native void collapse()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapse();
		}
	}-*/;

	public native void collapse(boolean recursive)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapse(recursive);
		}
	}-*/;

	public native void collapse(boolean recursive, Function callback)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.collapse(recursive, function() {
				callback.@com.ait.toolkit.core.client.Function::execute()();
			});
		}
	}-*/;

	public void collapse(Function callback) {
		collapse(false, callback);
	}

	public native NodeInterface copy(String id)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			var o = jso.copy(id);
			return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
	}-*/;

	public native NodeInterface copy(String id, boolean deep)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			var o = jso.copy(id, deep);
			return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;
	}-*/;

	public native NodeInterface createNode()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			var o = jso.createNode();
			return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
		}
		return null;

	}-*/;

	public native void destroy()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.destroy();
		}
	}-*/;

	public native void destroy(boolean silent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.destroy(silent);
		}
	}-*/;

	public native void contains(NodeInterface node)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso
					.contains(node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		}
		return false;
	}-*/;

	public native void eachChild(NodeTraversalCallback handler)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso
					.eachChild($entry(function() {
						var nodeObject = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this);
						handler.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeTraversalCallback::onNodeTraverse(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(nodeObject);
					}));
		}

	}-*/;

	public native void expand()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expand();
		}
	}-*/;

	public native void expand(boolean recursive)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expand(recursive);
		}
	}-*/;

	public native void expand(boolean recursive, Function callback)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expand(recursive, function() {
				callback.@com.ait.toolkit.core.client.Function::execute()();
			});
		}
	}-*/;

	public void expand(Function callback) {
		expand(false, callback);
	}

	public native NodeInterface findChildBy(NodeQueryHandler handler)/*-{
		var me = this;
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso
				.findChildBy(
						$entry(function(node) {
							//$wnd.console.log(node);
							var nodeObject = @com.ait.toolkit.data.client.TableItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
							return handler.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeQueryHandler::onNodeTraversal(Lcom/ait/toolkit/data/client/TableItem;)(nodeObject);
						}), me, true);
		return this;
	}-*/;

	public native void expandChildren()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expandChildren();
		}
	}-*/;

	public native void expandChildren(boolean recursive)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expandChildren(recursive);
		}
	}-*/;

	public native void expandChildren(boolean recursive, Function callback)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		if (jso) {
			jso.expandChildren(recursive, function() {
				callback.@com.ait.toolkit.core.client.Function::execute()();
			});
		}
	}-*/;

	public void expandChildren(Function callback) {
		expandChildren(false, callback);
	}

	public native NodeInterface findChildBy(NodeQueryHandler handler, boolean deep)/*-{
		var me = this;
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso
				.findChildBy(
						$entry(function(node) {
							var nodeObject = @com.ait.toolkit.data.client.TableItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
							return handler.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeQueryHandler::onNodeTraversal(Lcom/ait/toolkit/data/client/TableItem;)(nodeObject);
						}), me, deep);
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native NodeInterface findChild(String attribute, String value)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.findChild(attribute, value);
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native NodeInterface findChild(String attribute, String value, boolean deep)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.findChild(attribute, value, deep);
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native NodeInterface getChildAt(int index)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.getChildAt(index);
		if (obj) {
			return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		}
		return null;
	}-*/;

	public native String getPath()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getPath();
	}-*/;

	public native String getPath(String field)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getPath(field);
	}-*/;

	public native String getPath(String field, String separator)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getPath(field, separator);
	}-*/;

	public native TreeStore getTreeStore()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.getTreeStore();
		if (obj) {
			return @com.ait.toolkit.sencha.shared.client.data.TreeStore::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		}
		return null;
	}-*/;

	public native int getDepth()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getDepth();
	}-*/;

	public native int hasChildNodes()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.hasChildNodes();
	}-*/;

	public native int indexOf(NodeInterface node)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso
				.indexOf(node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native int indexOfId(String id)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.indexOf(id);
	}-*/;

	public native JavaScriptObject getOwnerTree()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.getOwnerTree();
	}-*/;

	public native NodeInterface insertBefore(BaseModel nodeToInsert, BaseModel referenceNode)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso
				.insertBefore(
						nodeToInsert.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						referenceNode.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native NodeInterface appendChild(BaseModel model)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso
				.appendChild(model.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native NodeInterface insertChild(int index, BaseModel node)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		var obj = jso.insertChild(index,
				node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native boolean isAncestor()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isAncestor();
	}-*/;

	public native boolean isExpandable()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isExpandable();
	}-*/;

	public native boolean isExpanded()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isExpanded();
	}-*/;

	public native boolean isFirst()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isFirst();
	}-*/;

	public native boolean isLast()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isLast();
	}-*/;

	public native boolean isLeaf()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isLeaf();
	}-*/;

	public native boolean isLoaded()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isLoaded();
	}-*/;

	public native boolean isLoading()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isLoading();
	}-*/;

	public native boolean isRoot()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isRoot();
	}-*/;

	public native boolean isVisible()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		return jso.isVisible();
	}-*/;

	public native NodeInterface removeAll()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.removeAll();
		return this;
	}-*/;

	public native NodeInterface removeAll(boolean destroy)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.removeAll(destroy);
		return this;
	}-*/;

	public native NodeInterface removeChild(BaseModel child)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso
				.removeChild(child.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native void sort()/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.sort();
	}-*/;

	public native void sort(NodeSorter sorter)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso
				.sort(function(n1, n2) {
					var node1 = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n1);
					var node2 = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n2);
					return sorter.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeSorter::sort(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(node1,node2);
				});
	}-*/;

	public native void sort(NodeSorter sorter, boolean recursive)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso
				.sort(
						function(n1, n2) {
							var node1 = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n1);
							var node2 = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n2);
							return sorter.@com.ait.toolkit.sencha.shared.client.data.handlers.NodeSorter::sort(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(node1,node2);
						}, recursive);
	}-*/;

	public native NodeInterface removeChild(BaseModel child, boolean destroy)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::jsObj;
		jso.removeChild(
				child.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				destroy);
		return this;
	}-*/;

	static JsArray<JavaScriptObject> fromListOfNode(List<NodeInterface> models) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (NodeInterface model : models) {
			values.push(model.getJsObj());
		}
		return values;
	}

	public List<NodeInterface> getChildNodes() {
		JavaScriptObject children = JsoHelper.getAttributeAsJavaScriptObject(jsObj, "childNodes");
		return fromJavaScriptArray(children);
	}

	public NodeInterface getFirstChild() {
		return new NodeInterface(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "firstChild"));
	}

	public NodeInterface getLastChild() {
		return new NodeInterface(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "lastChild"));
	}

	public NodeInterface getNextSibling() {
		return new NodeInterface(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "nextSibling"));
	}

	public NodeInterface getParentNode() {
		return new NodeInterface(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "parentNode"));
	}

	public NodeInterface getPreviousSibling() {
		return new NodeInterface(JsoHelper.getAttributeAsJavaScriptObject(jsObj, "previousSibling"));
	}

	public boolean isNode() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "isNode");
	}

	public static List<NodeInterface> fromJavaScriptArray(JavaScriptObject array) {
		List<NodeInterface> toReturn = new ArrayList<NodeInterface>();
		int size = JsoHelper.getArrayLength(array);
		for (int i = 0; i < size; i++) {
			JavaScriptObject peer = JsoHelper.getValueFromJavaScriptObjectArray(array, i);
			toReturn.add(new NodeInterface(peer));
		}
		return toReturn;
	}

}
