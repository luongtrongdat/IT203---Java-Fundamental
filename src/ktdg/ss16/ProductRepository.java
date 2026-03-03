package ktdg.ss16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product> {
    private List<Product> list;
    private Map<String, Product> map;

    public ProductRepository() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
    }

    @Override
    public boolean add(Product item) {
        if (item == null || map.containsKey(item.getId())) {
            return false;
        }
        list.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null || !map.containsKey(id)) {
            return false;
        }
        Product p = map.remove(id);
        list.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list);
    }
}