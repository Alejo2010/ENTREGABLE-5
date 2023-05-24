public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void Save(){
        System.out.println("Este metodo se llama : Save() ");
    }

    @Override
    public void Delete() {
        System.out.println("Este metodo se llama : Delete() ");
    }

    @Override
    public void FindAll() {
        System.out.println("Este metodo se llama : FindAll()");
    }
}
