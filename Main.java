public class Main {
    public static void main(String[] args) {
        RBTreeMapImplementation<String, Integer> rbTreeMapImplementation = new RBTreeMapImplementation<>();
        rbTreeMapImplementation.put("smert", 2);
        System.out.println(rbTreeMapImplementation.get("smert") + "  " + rbTreeMapImplementation.get("noSuchKey"));
    }
}
