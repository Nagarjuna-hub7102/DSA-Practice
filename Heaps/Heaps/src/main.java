public class main {
    public static void main(String[] args) throws Exception {
        Heaps<Integer> heap = new Heaps<>();

        heap.insert(35);
        heap.insert(22);
        heap.insert(45);
        heap.insert(67);
        heap.insert(11);
        heap.insert(98);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

        System.out.println(heap.HeapSort());
    }
}
