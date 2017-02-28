package Tree;

import java.util.Stack;

/**
*@author created by jonny
*@date 2017年2月28日--下午3:07:50
*
**/
public class PostOrderTree
{

	public void postorder(TNode node)
	{
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.val);
	}
	
	public void iterativePostOrder(TNode node)
	{
		Stack<TNode> stack = new Stack<>();
		TNode tmp = null;
		TNode peekNode = null;
		while(!stack.isEmpty() || node !=null)
		{
			if (node !=null)
			{
				stack.push(node);
				node = node.left;
			}else{
				peekNode = stack.peek();
				if (peekNode.right != null && tmp != peekNode.right)
				{
					node = peekNode.right;
				}else {
					stack.pop();
					System.out.println(peekNode.val);
					tmp = peekNode;
				}
			}
		}
	}
}
