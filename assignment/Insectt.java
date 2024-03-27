package assignment;

import java.util.ArrayList;
import java.util.List;

class Insect {
    private String insectName;
    private int insectWeight;

    public Insect(String insectName, int insectWeight) {
        this.insectName = insectName;
        this.insectWeight = insectWeight;
    }

    // Getters and setters
    public String getInsectName() {
        return insectName;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public int getInsectWeight() {
        return insectWeight;
    }

    public void setInsectWeight(int insectWeight) {
        this.insectWeight = insectWeight;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "insectName='" + insectName + '\'' +
                ", insectWeight=" + insectWeight +
                '}';
    }
}

class Insecticides {
    public List<String> mapInsectstName(List<Insect> list) {
        List<String> insectNames = new ArrayList<>();
        for (Insect insect : list) {
            insectNames.add(insect.getInsectName());
        }
        return insectNames;
    }

    public List<Insect> getWeight(List<Insect> list) {
        List<Insect> filteredList = new ArrayList<>();
        for (Insect insect : list) {
            int weight = insect.getInsectWeight();
            if (weight > 40 && weight <= 100) {
                filteredList.add(insect);
            }
        }
        return filteredList;
    }
}
public class Insectt {
    public static void main(String[] args) {
        Insecticides i = new Insecticides();
        List<Insect> list = new ArrayList<>();
        list.add(new Insect("Ant", 45));
        list.add(new Insect("Cockroach", 65));
        list.add(new Insect("bee", 99));
        list.add(new Insect("paper wasp", 11));

        System.out.println(i.mapInsectstName(list));
        System.out.println(i.getWeight(list));
    }
}
