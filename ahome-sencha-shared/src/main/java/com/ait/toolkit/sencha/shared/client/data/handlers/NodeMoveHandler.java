package com.ait.toolkit.sencha.shared.client.data.handlers;

import com.ait.toolkit.sencha.shared.client.data.NodeInterface;

public interface NodeMoveHandler {
	public void onMove(NodeInterface currentNode, NodeInterface newParent, NodeInterface oldParent, int index);
}
