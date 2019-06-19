package org.ko.sigma.rest.role.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ko.sigma.data.entity.RoleMenu;
import org.ko.sigma.rest.role.repository.RoleMenuRepository;
import org.ko.sigma.rest.role.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Throwable.class)
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuRepository, RoleMenu> implements RoleMenuService {

    @Autowired
    private RoleMenuRepository roleMenuRepository;

    @Override
    public Long createRoleMenu(String roleCode, List<String> menuCodes) {
        List<RoleMenu> roleMenus =  menuCodes.stream().map(menuCode -> buildRoleMenu(roleCode, menuCode)).collect(Collectors.toList());
        return roleMenuRepository.insertList(roleMenus);
    }

    private RoleMenu buildRoleMenu (String roleCode, String menuCode) {
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleCode(roleCode);
        roleMenu.setRoleCode(menuCode);
        return roleMenu;
    }
}
