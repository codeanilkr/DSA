import java.util.ArrayList;

public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } }
        public static Node insert(Node root, int val){
            if(root == null){
                return new Node(val);
            }
             if(root.data > val){
            // left Subtree
            root.left = insert(root.left, val);
            
        }else{
             root.right = insert(root.right, val);
        }
        return root;
        }
        // Inorder Function
        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }
       
//    Search Key In BST
public static boolean Search(Node root, int key){
    if(root == null){
        return false;
    }
    if(root.data>key){
        return Search(root.left, key);
    }
     else if(root.data == key){
        return true;
    }
     else{
        return Search(root.right, key);
    }

}
// Delet A node
public static Node delete(Node root, int val){
    if(root.data>val){
        root.left = delete(root.left, val);
    }
    else if(root.data<val){
        root.right = delete(root.right,val);
    }
    else{
        // Case 1St
        if(root.left== null && root.right == null){
return null;
        }
        // Case 2
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }

        // Case 3
        Node IS = inorderSuccesor(root.right);
        root.data = IS.data;
       root.right = delete(root.right, IS.data);
    }
    return root;
}
public static Node inorderSuccesor(Node root){
    while(root.left!=null){
        root = root.left;
    }
    return root;

}

// Print In Range
public static void printInRange(Node root, int x, int y){
    if(root == null){
        return;
    }
    if(root.data >= x && root.data <= y){
        printInRange(root.left, x, y);
        System.out.print(root.data + " ");
        printInRange(root.right,x,y);
        
    }
    else if(root.data >= y){
        printInRange(root.left, x, y);
    }
    else{
        printInRange(root.right, x, y);
    }
}
// Root To Leaf Path
public static void printPath(ArrayList<Integer> path){
for(int i=0; i<path.size(); i++){
    System.out.print(path.get(i) + "->");
}
System.out.println();
}
public static void printRoot2leaf(Node root, ArrayList<Integer> path){
    if(root == null){
        return;
    }
    path.add(root.data);

    // Leaf Node
if(root.left == null && root.right == null){
    printPath(path);
}
else{
    // Non Leaf
 printRoot2leaf(root.left, path);
   printRoot2leaf(root.right, path);
}


  
   path.remove(path.size()-1);
}

    public static void main(String[] args){
        // int values[] = {5,1,3,4,2,7};
        // int values[] = {8,5,3,1,4,6,10,11,14};
         int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i=0; i<values.length; i++){
          root = insert(root, values[i]);
        }
Inorder(root);
System.out.println();

// if(Search(root, 21)){
//     System.out.println("Found  ") ;
// }else{
//     System.out.println("Not Found");
// }
// delete(root, 8);
// Inorder(root);
// printInRange(root, 3, 12);
printRoot2leaf(root, new ArrayList<>());

    }
    
}
