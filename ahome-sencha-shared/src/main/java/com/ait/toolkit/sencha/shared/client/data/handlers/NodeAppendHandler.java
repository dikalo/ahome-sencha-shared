package com.ait.toolkit.sencha.shared.client.data.handlers;

import com.ait.toolkit.sencha.shared.client.data.NodeInterface;

public interface NodeAppendHandler {
	public void onAppend(NodeInterface currentNode, NodeInterface appendedNode, int index);
}
