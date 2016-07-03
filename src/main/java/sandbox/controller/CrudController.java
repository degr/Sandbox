package sandbox.controller;

import javassist.tools.web.BadHttpRequest;
import org.forweb.database.AbstractDao;
import org.forweb.database.AbstractEntity;
import org.forweb.database.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;


@MappedSuperclass
public class CrudController<E extends AbstractEntity, D extends AbstractDao<E>, S extends AbstractService<E, D>> {

    @Autowired
    S service;

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    @ResponseBody
    public AbstractEntity show(@PathVariable Integer id) {
        return service.findOne(id);
    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<E> showAll() {
        return service.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Integer create(@RequestBody E item) throws BadHttpRequest {
        if(item.getId() == null) {
            service.save(item);
            return item.getId();
        } else {
            throw new BadHttpRequest();
        }
    }
    @RequestMapping(method = RequestMethod.PUT, value="/{id}")
    @ResponseBody
    public Integer update(@RequestBody E item, @PathVariable Integer id) throws BadHttpRequest {
        if(item.getId() != null && item.getId().equals(id)) {
            service.save(item);
            return item.getId();
        } else {
            throw new BadHttpRequest();
        }
    }
    @RequestMapping(method =  RequestMethod.DELETE, value="/{id}")
    @ResponseBody
    public Integer delete(@PathVariable Integer id){
        try {
            service.delete(id);
            return 1;
        } catch (EmptyResultDataAccessException e) {
            return 0;
        }
    }
}
