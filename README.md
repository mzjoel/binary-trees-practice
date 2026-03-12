# Simulasi Binary Tree dengan Java

Proyek ini adalah simulasi sederhana dari struktur data **Binary Tree** menggunakan bahasa pemrograman Java. Proyek ini terdiri dari implementasi dasar Node beserta pengembangannya (`AdvancedNode`) yang memiliki fungsionalitas tambahan untuk memanipulasi dan menelusuri (traverse) pohon biner.

## Struktur File
1. **`Node.java`**: Kelas dasar yang merepresentasikan sebuah elemen tunggal (node) dalam tree. Memiliki atribut `value` untuk menyimpan data, serta referensi ke node `left` (kiri) dan `right` (kanan).
2. **`AdvancedNode.java`**: Kelas turunan pewarisan (inheritance) dari `Node.java`. Kelas ini menambahkan metode-metode encapsulation/fungsi utilitas pendukung seperti setter, getter, dan metode `print()` untuk mencetak seluruh isi pohon biner ke bawahnya.
3. **`MainAdvanced.java`** / **`Main.java`**: Kelas utama (entry point) untuk mengeksekusi dan menguji coba (simulasi) pembuatan struktur Binary Tree secara langsung.

## Fitur `AdvancedNode`
Kelas ini memperluas kemampuan `Node.java` dengan menambahkan metode:
- `setLeft(Node node)`: Menambahkan child node ke sisi kiri (jika sisi kiri kosong).
- `setRight(Node node)`: Menambahkan child node ke sisi kanan (jika sisi kanan kosong).
- `getLeft()`: Mengembalikan objek Node anak kiri.
- `getRight()`: Mengembalikan objek Node anak kanan.
- `setData(int data)`: Mengubah/memperbarui nilai pada node yang difokuskan.
- `getData()`: Membaca nilai (data) yang ada pada node.
- `print()`: Menampilkan nilai dari node itu sendiri beserta seluruh anak-anaknya di bawahnya.

## Tree Traversal (Penelusuran Pohon Biner)
Dalam proyek ini, metode yang digunakan untuk menelusuri isi tree saat memanggil `print()` adalah metode **In-order Traversal**. Namun, secara konsep, ada 3 skema penelusuran (Depth-First Search) yang umum dipakai pada Binary Tree.

### 1. In-order Traversal (Kiri → Root → Kanan)
Metode default yang dipakai di kelas `AdvancedNode`.
- **Urutan Ekseskusi:** Program menelusuri cabang paling kiri hingga tak tersisa, lalu mencetak nilai dirinya (root), kemudian baru menelusuri cabang kanannya.
- **Kapan Digunakan?** Paling sering digunakan pada Binary Search Tree (BST) guna mengambil/mencetak data secara terurut dari nilai terkecil hingga terbesar (sorting).
- **Contoh Implementasi Code:**
  ```java
  private void printInOrder(Node node){
      if(node != null){
          printInOrder(node.left);        // Kiri
          System.out.println(node.value); // Root
          printInOrder(node.right);       // Kanan
      }
  }
  ```

### 2. Pre-order Traversal (Root → Kiri → Kanan)
- **Urutan Ekseskusi:** Program langsung mencetak nilai dirinya terlebih dahulu di awal, kemudian baru menelusuri cabang kiri hingga habis, menyusul penelusuran cabang kanan.
- **Kapan Digunakan?** Sangat berguna jika Anda ingin membuat salinan (copy/duplicate) dari struktur tree secara sempurna karena pembacaannya dimulai lurus dari parent teratas. Digunakan pula untuk mendapatkan ekspresi *Prefix*.
- **Contoh Implementasi Code:**
  ```java
  private void printPreOrder(Node node){
      if(node != null){
          System.out.println(node.value); // Root
          printPreOrder(node.left);       // Kiri
          printPreOrder(node.right);      // Kanan
      }
  }
  ```

### 3. Post-order Traversal (Kiri → Kanan → Root)
- **Urutan Ekseskusi:** Program menelusuri seluruh anak di cabang kiri hingga habis, kemudian beralih ke seluruh anak di cabang kanan hingga habis, dan objek root-nya adalah yang terakhir dicetak/dieksekusi.
- **Kapan Digunakan?** Sangat penting ketika ingin menghapus/dealokasi memori sebuah tree secara keseluruhan, di mana parent tidak bisa dihapus sebelum anak-anaknya dihapus. Juga dipakai untuk menghitung total ukuran tree dari tingkat paling bawah.
- **Contoh Implementasi Code:**
  ```java
  private void printPostOrder(Node node){
      if(node != null){
          printPostOrder(node.left);        // Kiri
          printPostOrder(node.right);       // Kanan
          System.out.println(node.value);   // Root
      }
  }
  ```

---

## Cara Menjalankan Program

Untuk mencoba simulasi Binary Tree:

1. Buka terminal atau command line di direktori tempat file-file ini berada.
2. Lakukan proses kompilasi kode Java menjadi bytecode menggunakan perintah:
   ```bash
   javac Node.java AdvancedNode.java MainAdvanced.java
   ```
3. Setelah proses kompilasi berhasil (tidak ada pesan error), eksekusi program utamanya dengan perintah:
   ```bash
   java MainAdvanced
   ```

*(Atau, jika Anda menggunakan IDE modern seperti VS Code atau IntelliJ, Anda cukup menekan tombol **Run/Play** di file `MainAdvanced.java` dan IDE akan menangani kompilasinya secara otomatis).*
