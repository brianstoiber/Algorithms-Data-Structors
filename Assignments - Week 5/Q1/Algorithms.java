// 1a) Complexity of algorithm - O(log n) where n is height of the tree
preOrderNext(Position p)
	if p isInternal:
		return p's left child
	else
		Position parent = parent of p
     if p is left child of parent
          return right child of parent
     else
        while p not the left child of parent
        	p = parent
        	parent = parent's parent
        return right child of parent



// 1b) Complexity of algorithm - O(log n) where n is height of the tree
inOrderNext(Position p)
	if p isInternal
		p = right child of p
		while p is not external
			p = left child of p
		return p
	else
		Position parent = parent of p
		if p is left child of parent
			return parent
		else
			while p is not left child of parent
				p = parent
				parent = parent's parent
			return parent



// 1c) Complexity of algorithm - O(log n) where n is height of the tree
postOrderNext(Position p)
	Position parent = parent of p
	if p isInternal
		if p is right child of parent
			return parent
		else
			p = right child of parent
			while p is not external
				p = left child of p
			return p
	else
		if p is left child of parent
			return right child of parent
		else
			return parent