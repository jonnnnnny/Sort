package Tree;

import java.util.Stack;

/**
*@author created by jonny
*@date 2017年2月28日--下午3:00:56
*
**/
public class InorderTree
{

	public void inorder(TNode root)
	{
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
	}
	
	public void iterativeInorder(TNode node)
	{
		Stack<TNode> stack = new Stack<>();
		while(!stack.isEmpty() || node !=null)
		{
			if (node != null)
			{
				stack.push(node);
				node = node.left;
			}else {
				node = stack.pop();
				System.out.println(node.val);
				node = node.right;
			}
		}
	}
}
