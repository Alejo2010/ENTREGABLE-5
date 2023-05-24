public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl cocheCrudImpl = new CocheCRUDImpl();
        cocheCrudImpl.Delete();
        cocheCrudImpl.FindAll();
        cocheCrudImpl.Save();
    }
}
