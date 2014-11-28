package com.ait.toolkit.sencha.shared.client.data.handlers;

import com.ait.toolkit.sencha.shared.client.data.NodeInterface;

public interface NodeRemoveHandler {
	public void onRemove(NodeInterface currentNode, NodeInterface removedNode, boolean isMove);
}
