package by.learn.lifo.entity;

import by.learn.lifo.exception.InvalidOperationException;
import by.learn.lifo.exception.WrongStackIndexException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackArray<T> {
    private List<T> stack;

    public StackArray() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        this.stack.add(0,item);
    }

    public T pop() throws InvalidOperationException {
        if (this.stack.isEmpty()) {
            throw new InvalidOperationException("The stack is empty");
        }
        T result = this.stack.get(0);
        this.stack.remove(0);
        return result;
    }

    public T peek() throws InvalidOperationException {
        if (this.stack.isEmpty()) {
            throw new InvalidOperationException("The stack is empty");
        }
        return this.stack.get(0);
    }

    public StackArray<T> peek(int index) throws InvalidOperationException, WrongStackIndexException {
        if (this.stack.isEmpty()) {
            throw new InvalidOperationException("The stack is empty");
        }
        if (index <= 0) {
            throw new WrongStackIndexException("Negative index: " + index);
        }

        Iterator<T> iterator = this.stack.iterator();
        StackArray<T> tempStack = new StackArray<>();
        for (int i = 0; i < index; i++) {
            if (iterator.hasNext()) {
                tempStack.push(iterator.next());
            }
        }
        return tempStack;
    }

    public int count() {
        return this.stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
