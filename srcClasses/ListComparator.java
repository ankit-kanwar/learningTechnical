package com.tollring.ic360.util;

import java.util.ArrayList;
import java.util.List;

public class ListComparator<T>
{

    public ListComparator()
    {
        firstOnly = new ArrayList<T>();
        both = new ArrayList<T>();
        secondOnly = new ArrayList<T>();
    }

    public ListComparator(List<T> list1, List<T> list2)
    {
        firstOnly = new ArrayList<T>();
        both = new ArrayList<T>();
        secondOnly = new ArrayList<T>();
        inFirstOnly().addAll(list1);
        inFirstOnly().removeAll(list2);
        inBoth().addAll(list2);
        inBoth().retainAll(list1);
        inSecondOnly().addAll(list2);
        inSecondOnly().removeAll(list1);
    }

    public List<T> inFirstOnly()
    {
        return firstOnly;
    }

    public List<T> inBoth()
    {
        return both;
    }

    public List<T> inSecondOnly()
    {
        return secondOnly;
    }

    private List<T> firstOnly;
    private List<T> both;
    private List<T> secondOnly;
}
