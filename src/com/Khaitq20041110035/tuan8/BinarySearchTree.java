package com.Khaitq20041110035.tuan8;

public class BinarySearchTree {
    /* Lớp đại diện cho node bao gồm node con trái và phải cùng với giá trị của key */
class Node 
{ 
   int key; 
   Node left, right; 

   public Node(int item) 
   { 
       key = item; 
       left = right = null; 
   } 
} 

// Root của cây 
Node root; 

// Hàm dựng 
BinarySearchTree() 
{ 
   root = null; 
} 

// Gọi phương thức deleteRec 
void deleteKey(int key) 
{ 
   root = deleteRec(root, key); 
} 

/* Hàm đệ qui để xóa phần tử khỏi mảng */
Node deleteRec(Node root, int key) 
{ 
   /* trường hợp gốc : nếu node root null */
   if (root == null)  return root; 

   /* ngược lại chúng ta sẽ duyệt dọc cây  */
   if (key < root.key) 
       root.left = deleteRec(root.left, key); 
   else if (key > root.key) 
       root.right = deleteRec(root.right, key); 

   // nếu key có cùng giá trị với node key thì chính là node cần xóa 
   else
   { 
       // node không có hoặc chỉ có 1 node con 
       if (root.left == null) 
           return root.right; 
       else if (root.right == null) 
           return root.left; 

       // node có 2 node con.
       root.key = minValue(root.right); 

       // Xóa phần từ nhỏ nhất bên phải
       root.right = deleteRec(root.right, root.key); 
   } 

   return root; 
} 

int minValue(Node root) 
{ 
   int minv = root.key; 
   while (root.left != null) 
   { 
       minv = root.left.key; 
       root = root.left; 
   } 
   return minv; 
} 

// Gọi phương thức insert
void insert(int key) 
{ 
   root = insertRec(root, key); 
} 

/* Hàm đệ qui thực hiện việc chèn phần từ vào cây */
Node insertRec(Node root, int key) 
{ 

   /* nếu cây rỗng trả về node mới */
   if (root == null) 
   { 
       root = new Node(key); 
       return root; 
   } 

   /* ngược lại sẽ thực hiện duyệt dọc cây */
   if (key < root.key) 
       root.left = insertRec(root.left, key); 
   else if (key > root.key) 
       root.right = insertRec(root.right, key); 

   /* trả về cây nhị phân đã được thêm phần tử mới */
   return root; 
} 

// Phương thức gọi hàm sắp xếp 
void inorder() 
{ 
   inorderRec(root); 
} 

// hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp 
void inorderRec(Node root) 
{ 
   if (root != null) 
   { 
       inorderRec(root.left); 
       System.out.print(root.key + " "); 
       inorderRec(root.right); 
   } 
} 

public static void main(String[] args) 
{ 
   BinarySearchTree tree = new BinarySearchTree(); 

   /* Let us create following BST 
         50 
      /     \ 
     30      70 
    /  \    /  \ 
   20   40  60   80 */
   tree.insert(50); 
   tree.insert(30); 
   tree.insert(20); 
   tree.insert(40); 
   tree.insert(70); 
   tree.insert(60); 
   tree.insert(80); 

   System.out.println("Inorder traversal of the given tree"); 
   tree.inorder(); 

   System.out.println("\nDelete 20"); 
   tree.deleteKey(20); 
   System.out.println("Inorder traversal of the modified tree"); 
   tree.inorder(); 

   System.out.println("\nDelete 30"); 
   tree.deleteKey(30); 
   System.out.println("Inorder traversal of the modified tree"); 
   tree.inorder(); 

   System.out.println("\nDelete 50"); 
   tree.deleteKey(50); 
   System.out.println("Inorder traversal of the modified tree"); 
   tree.inorder(); 
} 

    
}
