package ch4.sunmin.item18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ForwardingSet<E> implements Set<E> { // HashSet이 아닌 인터페이스 타입을 구현한다.
	
	private final Set<E> s; // private 으로 인스턴스 변수를 가지고 생성자에서 매개변수로 받는다.
	public ForwardingSet(Set<E> s) {this.s = s;} // 아무 제너릭 타입 E가 아닌 Set 타입 E를 지정한다.
	
    public void clear()               { s.clear();            }
    public boolean contains(Object o) { return s.contains(o); }
    public boolean isEmpty()          { return s.isEmpty();   }
    public int size()                 { return s.size();      }
    public Iterator<E> iterator()     { return s.iterator();  }
    public boolean add(E e)           { return s.add(e);      }
    public boolean remove(Object o)   { return s.remove(o);   }
    public boolean containsAll(Collection<?> c)
                                   	  { return s.containsAll(c); }
    public boolean addAll(Collection<? extends E> c)
    								  { return s.addAll(c);      }
    public boolean removeAll(Collection<?> c)
                                   	  { return s.removeAll(c);   }
    public boolean retainAll(Collection<?> c)
                                   	   { return s.retainAll(c);   }
    public Object[] toArray()          { return s.toArray();  }
    public <T> T[] toArray(T[] a)      { return s.toArray(a); }
    
    @Override public boolean equals(Object o)
                                       { return s.equals(o);  }
    @Override public int hashCode()    { return s.hashCode(); }
    @Override public String toString() { return s.toString(); }

}
