class PeekingIterator implements Iterator<Integer> {
    ArrayList<Integer> list;
    int current;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    list = new ArrayList<>();
        current = 0;
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(current);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return list.get(current++);
	}
	
	@Override
	public boolean hasNext() {
        return current <= list.size() - 1;
	}
}