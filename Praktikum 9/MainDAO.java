/*
 * File : MainDAO.java
 * Penulis : Dorino Baharson / 24060121130090
 * Tanggal : 31/5/2023
 * Deskripsi : file main untuk menjalankan DAO
 */
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
