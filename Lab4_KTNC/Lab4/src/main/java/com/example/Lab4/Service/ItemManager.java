package com.example.Lab4.Service;

import com.example.Lab4.Entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    private List<Item> items = new ArrayList<>();

    public ItemManager() {
        items.add(new Item(1, "item1"));
        items.add(new Item(2, "item2"));
        items.add(new Item(3, "item3"));
        items.add(new Item(4, "item4"));
    }

    public boolean addItem(Item item) {
        if (item.getId() < 0 || item.getId() > 10) {
            throw new IndexOutOfBoundsException("Yêu cầu ID nằm trong khoảng 0 đến 10");
        }
        return items.add(item);
    }


    public boolean updateItem(int id, String newName) {
        if (id < 0 || id > 10) {
            throw new IndexOutOfBoundsException("Yêu cầu ID nằm trong khoảng 0 đến 10");
        }
        boolean success = false;
        for (Item i : items) {
            if (i.getId() == id) {
                i.setName(newName);
                success = true;
                break;
            }
        }
        return success;
    }

    public boolean deleteItem(int id) {
        if (id < 0 || id > 10) {
            throw new IndexOutOfBoundsException("Yêu cầu ID nằm trong khoảng 0 đến 10");
        }
        return items.removeIf(item -> item.getId() == id);
    }

}
