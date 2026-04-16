class MinStack {

    List<int[]> list;

    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        if (list.isEmpty()) {
            list.add(new int[]{val, val});
        } else {
            int currentMin = list.get(list.size() - 1)[1];
            list.add(new int[]{val, Math.min(val, currentMin)});
        }
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1)[0];
    }
    
    public int getMin() {
        return list.get(list.size() - 1)[1];
    }
}