// The following is pseudocode for a non-recursive algorithm  

	nonRecursiveInorderTraversal(Node<E> root); {
		if(root == null) {
			return null;
		}
	
		LinkedStack stack = new LinkedStack();
			while(true){
				while(root != null){
					stack.push(root);
					root = root.getLeft();
			}
				if(stack.isEmpty()){
					break;
			}
		
			root = stack.pop();
			System.out.println(root.getElement());
			root = root.getRight();
			}
		return;
	}