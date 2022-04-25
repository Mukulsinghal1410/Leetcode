// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> iterator;
	private Integer curr;
	private boolean next;

	public PeekingIterator(Iterator<Integer> iterator) {
		this.iterator = iterator;
		prepareNext();
	}

	private void prepareNext() {
	    next = iterator.hasNext();
	    curr = next ? iterator.next() : null;
	}

	public Integer peek() {
		return curr;
	}

	@Override
	public Integer next() {
		Integer val = curr;
		prepareNext();
		return val;
	}

	@Override
	public boolean hasNext() {
		return next;
	}
}