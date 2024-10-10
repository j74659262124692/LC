class RandomizedSet {
            private List<Integer> list;
            private HashSet<Integer> set;

            public RandomizedSet() {
                this.list = new ArrayList<>();
                this.set = new HashSet<>();
            }

            public boolean insert(int val) {
                if (set.contains(val)) {
                    return false;
                }

                set.add(val);
                list.add(val);
                return true;
            }

            public boolean remove(int val) {
                if (!set.contains(val)) {
                    return false;
                }

                set.remove(val);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == val) {
                        list.remove(i);
                        break;
                    }
                }
                return true;
            }

            public int getRandom() {
                int size = list.size();
                int index = new Random().nextInt(size);
                return list.get(index);
            }
        }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */