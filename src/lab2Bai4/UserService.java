/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab2Bai4;

import java.util.List;

/**
 *
 * @author ACER
 */
public interface UserService {
    public boolean addUser(User u);
    public boolean removeUser(int index);
    public boolean uppDate(User u, int index);
    public List<User> getAll( ); 
}
