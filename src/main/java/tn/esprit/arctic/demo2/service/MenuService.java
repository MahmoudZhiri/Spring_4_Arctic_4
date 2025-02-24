package tn.esprit.arctic.demo2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo2.entities.Menu;
import tn.esprit.arctic.demo2.serviceImplementations.IMenuService;
import tn.esprit.arctic.demo2.repository.MenuRepo;

import java.util.List;

@Service
@AllArgsConstructor

public class MenuService implements IMenuService {
    private MenuRepo menuRepo;

    @Override
    public List<Menu> retrieveAllMenus() {
        return menuRepo.findAll();
    }

    @Override
    public Menu addMenu(Menu e) {
        menuRepo.save(e);
        return e;
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepo.save(e);
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        return menuRepo.findById(idMenu).get();
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepo.deleteById(idMenu);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepo.saveAll(menus);
    }
}