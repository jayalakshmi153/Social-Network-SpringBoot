package com.example.socialapp.service;

import com.example.socialapp.repository.RoleRepository;
import com.example.socialapp.domain.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

}
