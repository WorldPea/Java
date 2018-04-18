package Tree;

class Tree{
	int value;
	Tree ltree,rtree;
	Tree(){}
	Tree(int v){
		this.ltree=null;
		this.rtree=null;
		this.value = v;
	}
}
public class BinarySortTree {
	/*二叉排序树
	 * */
	public static void main(String[] args) {
		int[] array = {3,1,2,5,0,7,9,8};
		int[] array1 = {0,1,2,3,5,7,8,9};
		Tree root = new Tree(3);
		Tree root1 = addTreeNodeMinheight(array1,0,array1.length-1);
		for(int i=1;i<array.length;i++){
			addTreeNode(root,array[i]);
		}
		preOrderPrint(root1);
		System.out.println();
		MiddleOrderPrint(root1);
		System.out.println();
		afterOrderPrint(root1);
	}
	public static Tree addTreeNode(Tree root, int v){
		if(root == null){
			root = new Tree(v);
			return root;
		}
		else{
			if(v <= root.value)
				root.ltree = addTreeNode(root.ltree,v);
			else
				root.rtree = addTreeNode(root.rtree,v);
			return root;	
		}
	}
	public static Tree addTreeNodeMinheight(int[] a,int start,int end){//最小高度的二叉排序树结构图
		if(start >end)
			return null;
		int middle = (start+end)/2;
		Tree root = new Tree(a[middle]);
		root.ltree = addTreeNodeMinheight(a,start,middle-1);
		root.rtree = addTreeNodeMinheight(a,middle+1,end);
		return root;
	}
	public static void preOrderPrint(Tree root){//前序遍历
		if(root != null){
			System.out.print(root.value);
			preOrderPrint(root.ltree);
			preOrderPrint(root.rtree);
		}
	}
	public static void MiddleOrderPrint(Tree root){//中序遍历
		if(root != null){
			MiddleOrderPrint(root.ltree);
			System.out.print(root.value);
			MiddleOrderPrint(root.rtree);
		}
	}
	public static void afterOrderPrint(Tree root){//后序遍历
		if(root != null){
			afterOrderPrint(root.ltree);
			afterOrderPrint(root.rtree);
			System.out.print(root.value);
		}
	}
}

