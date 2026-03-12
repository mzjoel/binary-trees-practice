public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulasi Binary Tree ===");
        
        // 1. Membuat node root
        Node root = new Node(10);
        System.out.println("Root node dibuat dengan nilai: " + root.value);
        
        // 2. Menambahkan child node
        root.left = new Node(5);
        root.right = new Node(15);
        System.out.println("Child kiri ditambahkan dengan nilai: " + root.left.value);
        System.out.println("Child kanan ditambahkan dengan nilai: " + root.right.value);
        
        // Menambahkan child ke child kiri
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        System.out.println("Child kiri dari " + root.left.value + " adalah: " + root.left.left.value);
        System.out.println("Child kanan dari " + root.left.value + " adalah: " + root.left.right.value);
        
        // 3. Menampilkan hasil (In-order Traversal)
        System.out.println("\n--- Hasil In-order Traversal (Kiri - Root - Kanan) ---");
        printInOrder(root);
        System.out.println(); // newline di akhir
    }
    
    // Metode rekursif sederhana untuk mencetak node (In-order)
    public static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.value + " ");
            printInOrder(node.right);
        }
    }
}