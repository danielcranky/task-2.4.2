package web.service;

import web.model.Role;

import java.util.Set;

public interface RoleService {
    Set<Role> getRoles();
    Role getRole(String s);
}
