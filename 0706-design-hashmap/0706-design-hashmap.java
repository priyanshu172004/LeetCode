class MyHashMap {
    class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<Pair> map;

    public MyHashMap() {
        map = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (Pair p : map) {
            if (p.key == key) {
                p.value = value;
                return;
            }
        }
        map.add(new Pair(key, value));
    }

    public int get(int key) {
        for (Pair p : map) {
            if (p.key == key) {
                return p.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).key == key) {
                map.remove(i);
                return;
            }
        }
    }
}