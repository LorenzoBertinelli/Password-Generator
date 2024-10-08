package com.mycompany.passwordmanager;

import java.util.List;

/**
 *
 * @author Lorenzo
 */
public interface IJsonManager {
    public boolean ReadAccoutToJSON(String username, String password);
    public void saveLoginState(String username);
    public void WritePasswordToJSON(String accountName, String email, String password, String note, String username, javax.swing.JFrame object);
    public List<Entry> GetEntryListFromJSON(String accountSearch, String entryToDelete,  Account account);
    public void saveEntriesToJson(List<Entry> entries, Account account);
    public void createUserFile(String username, String password);
    public void addUserToCentralFile(String username, String password);
    public void WriteAccountToJSON(String username, String password);
}