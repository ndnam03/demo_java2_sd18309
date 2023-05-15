/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2Bai4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class UserServiceImpl implements UserService {

    private List<User> listUser = new ArrayList<>();

    public UserServiceImpl() {
        listUser.add(new User("trang1", "1", "User"));
        listUser.add(new User("trang2", "2", "User"));
        listUser.add(new User("trang3", "3", "Admin"));
    }

    @Override
    public List<User> getAll() {

        return listUser;
    }

    @Override
    public boolean addUser(User u) {
        boolean t = false;
        if (u != null) {
            t = true;

        }
        return t;
    }

    @Override
    public boolean removeUser(int index) {
        boolean t = false;
        if (index >= 0) {
            listUser.remove(index);
            t = true;
        }

        return t;

    }

    @Override
    public boolean uppDate(User u, int index) {
        boolean t = false;
        if (index >= 0 && u != null) {
            listUser.set(index, u);
            t = true;
        }

        return t;
    }

}
