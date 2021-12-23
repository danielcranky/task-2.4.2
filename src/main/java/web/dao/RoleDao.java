package web.dao;

import web.model.Role;

import java.util.Set;

public interface RoleDao {
    Set<Role> getRoles();
    Role getRole(String s);
}
