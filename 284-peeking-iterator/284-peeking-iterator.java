class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it = null;
    private Integer nextVal = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        it = iterator; 
        if(it.hasNext()){
            nextVal = it.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = nextVal; 
        if(it.hasNext()){
            nextVal = it.next();
        }
        else{
            nextVal = null;
        }
        return val; 
	}
	@Override
	public boolean hasNext() {
	    return nextVal!= null;
	}
}