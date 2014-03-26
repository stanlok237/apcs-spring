import java.util.*;
import java.io.*;

public class MyLLIterator<E> implements Iterator <E>{

    private Node<E> currentNode;

    public MyLLIterator<E>(Node<E> n){