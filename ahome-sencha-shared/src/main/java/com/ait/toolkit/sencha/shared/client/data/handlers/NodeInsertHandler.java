package com.ait.toolkit.sencha.shared.client.data.handlers;

import com.ait.toolkit.sencha.shared.client.data.NodeInterface;

public interface NodeInsertHandler {
	public void onInsert(NodeInterface currentNode, NodeInterface insertNode, NodeInterface referenceNode);
}
