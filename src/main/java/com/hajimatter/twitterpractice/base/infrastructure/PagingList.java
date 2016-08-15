package com.hajimatter.twitterpractice.base.infrastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import lombok.Getter;

public class PagingList<ENTITY> implements List<ENTITY> {

	@Getter
	private Integer currentPage;

	private boolean existsNextPage;

	@Getter
	private List<ENTITY> selections = new ArrayList<>();

	@Override
	public int size() {
		return selections.size();
	}

	@Override
	public boolean isEmpty() {
		return selections.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return selections.contains(o);
	}

	@Override
	public Iterator<ENTITY> iterator() {
		return selections.iterator();
	}

	@Override
	public Object[] toArray() {
		return selections.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return selections.toArray(a);
	}

	@Override
	public boolean add(ENTITY e) {
		return selections.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return selections.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return selections.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends ENTITY> c) {
		return selections.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends ENTITY> c) {
		return selections.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return selections.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return selections.retainAll(c);
	}

	@Override
	public void clear() {
		selections.clear();
	}

	@Override
	public ENTITY get(int index) {
		return selections.get(index);
	}

	@Override
	public ENTITY set(int index, ENTITY element) {
		return selections.set(index, element);
	}

	@Override
	public void add(int index, ENTITY element) {
		selections.add(index, element);
	}

	@Override
	public ENTITY remove(int index) {
		return selections.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return selections.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return selections.lastIndexOf(o);
	}

	@Override
	public ListIterator<ENTITY> listIterator() {
		return selections.listIterator();
	}

	@Override
	public ListIterator<ENTITY> listIterator(int index) {
		return selections.listIterator(index);
	}

	@Override
	public List<ENTITY> subList(int fromIndex, int toIndex) {
		return selections.subList(fromIndex, toIndex);
	}

	public PagingList(Integer currentPage, boolean existsNextPage, List<ENTITY> selections) {
		this.currentPage = currentPage;
		this.existsNextPage = existsNextPage;
		this.selections = selections;
	}

	public boolean existsNextPage(){
		return existsNextPage;
	}
}
