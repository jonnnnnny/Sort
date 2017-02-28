package Tree;

import java.util.Stack;

public class PreorderTree
{

	public void preorder(TNode root)
	{
		if (root !=null)
		{
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void iterativePreorder(TNode root)
	{
		Stack<TNode> parentStack = new Stack<>();
		parentStack.push(root);
		while(!parentStack.isEmpty())
		{
			TNode tmp = parentStack.peek();
			System.out.println(tmp.val);
			parentStack.pop();
			if (tmp.right != null)
			{
				parentStack.push(tmp.right);
			}
			if (tmp.left !=null)
			{
				parentStack.push(tmp.left);
			}
		}
	}
}
