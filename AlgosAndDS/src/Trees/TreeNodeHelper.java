package Trees;

public class TreeNodeHelper {
	
	public TreeNode insertIteratively(TreeNode root, int data){
		
		TreeNode node = new TreeNode(data);
		if(root==null) return node;
		
		TreeNode parent=null,current=root;
		while(current!=null){
			parent=current;
			if(current.data<=data) current = current.left;
			else current = current.right;
		}
		if(parent.data<=data) parent.left = node;
		else parent.right = node;
		
		return root;
		
	}
	
	public TreeNode insertRecursively(TreeNode root, int data){
			
			//TreeNode node = new TreeNode(data);
			if(root==null) return new TreeNode(data);
			
			if(root.data<=data) 
				root.left = insertRecursively(root.left,data);
			else 
				root.right = insertRecursively(root.right,data);
			
			return root;
			
		}

}
