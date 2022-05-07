package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private final int capacity;
    List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (data.size() <= capacity) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        Pet pet = this.data.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        if (pet == null) {
            return false;
        } else {
            this.data.remove(pet);
            return true;
        }
    }

    public Pet getPet(String name, String owner) {
        return this.data
                .stream()
                .filter(p -> p.getName().equals(name) && p.getOwner().equals(owner))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        return getNameAndOwner();
    }

    private String getNameAndOwner() {
        System.out.println("The grooming salon has the following clients:");
        StringBuilder sb = new StringBuilder();
        for (Pet pet : this.data) {
            sb.append(pet.getName()).append(" ");
            sb.append(pet.getOwner());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
