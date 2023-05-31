/*
 * File : DAOManager.java
 * Penulis : Dorino Baharson / 24060121130090
 * Tanggal : 31/5/2023
 * Deskripsi : file java DAO Manager untuk manager DAO
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
