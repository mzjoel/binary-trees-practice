public class MainAdvanced {
    public static void main(String[] args) {
        System.out.println("=== Simulasi Advanced Binary Tree ===");
        
        // 1. Membuat node root menggunakan AdvancedNode
        AdvancedNode root = new AdvancedNode(10);
        System.out.println("Root node dibuat dengan nilai awal: " + root.getData());
        
        // Mengubah nilai menggunakan setData
        root.setData(20);
        System.out.println("Root node diubah menjadi: " + root.getData());
        
        // 2. Menambahkan child node menggunakan setLeft dan setRight
        AdvancedNode leftChild = new AdvancedNode(15);
        AdvancedNode rightChild = new AdvancedNode(25);
        
        root.setLeft(leftChild);
        root.setRight(rightChild);
        
        // 3. Menampilkan isi menggunakan getLeft dan getRight
        System.out.println("Child kiri adalah: " + root.getLeft().value);
        System.out.println("Child kanan adalah: " + ((AdvancedNode)root.getRight()).getData());
        
        // Menambahkan child ke child kiri
        AdvancedNode llChild = new AdvancedNode(10);
        AdvancedNode lrChild = new AdvancedNode(18);
        leftChild.setLeft(llChild);
        leftChild.setRight(lrChild);
        
        // 4. Memanggil method print() yang baru dibuat
        System.out.println("\n--- Hasil Method print() ---");
        root.print();
    }
}
