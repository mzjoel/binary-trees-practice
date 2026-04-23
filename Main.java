import java.util.Scanner;

public class Main {
    public static void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printInOrder(node.getRight());
        }
    }

    public static void printPreOrder(Node node){
        if(node != null){
            System.out.print(node.getData() + " ");
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    public static void printPostOrder(Node node){
        if(node != null){
            printPostOrder(node.getLeft());
            printPostOrder(node.getRight());
            System.out.print(node.getData()+ " ");
        }
    }

    public static Node buildTree(){
        Node root = new Node(10);
        root.setLeft(new Node(5));
        root.setRight(new Node(15));
        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(7));
        return root;
    }

    public static void printTree(Node node, String prefix, boolean isLeft){
        if(node != null){
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());
            printTree(node.getLeft(),  prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public static void showMenu() {
        System.out.println("BINARY TREE TRAVERSAL");
        System.out.println("1. In-Order(Kiri-Root-Kanan)");
        System.out.println("2. Pre-Order(Root-Kiri-Kanan)");
        System.out.println("3. Post-Order (Kiri-Kanan-Root)");
        System.out.println("4. Tampilkan Struktur Tree");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Node root = buildTree();
        System.out.println("Binary Tree");
        System.out.println("Binary Tree Terbuat Dengan Node 10, 5, 15, 3, 7");

        boolean running =true;

        while(running){
            showMenu();
            String input = scanner.nextLine().trim();

            switch(input){
                case "1":
                    System.out.println("\n>>In-Order Traversal (Kiri → Root → Kanan)");
                    System.out.print("   Hasil: ");
                    printInOrder(root);
                    System.out.println();
                    break;

                case "2":
                    System.out.println("\n>> Pre-Order Traversal (Root → Kiri → Kanan)");
                    System.out.print("   Hasil: ");
                    printPreOrder(root);
                    System.out.println();
                    break;

                case "3":
                    System.out.println("\n>> Post-Order Traversal (Kiri → Kanan → Root)");
                    System.out.print("   Hasil: ");
                    printPostOrder(root);
                    System.out.println();
                    break;

                case "4":
                    System.out.println("\n>> Struktur Binary Tree:");
                    System.out.println("   " + root.getData());
                    printTree(root.getLeft(),  "   ", true);
                    printTree(root.getRight(), "   ", false);
                    break;

                case "5":
                    System.out.println("\nTerima kasih! Program selesai.");
                    running = false;
                    break;

                default:
                    System.out.println("\nPilihan tidak Tersedia.");
            }
        }

        scanner.close();
    }
}