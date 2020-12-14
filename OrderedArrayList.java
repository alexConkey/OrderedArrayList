import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      for(int i = 0; i < size(); i++){
        if (get(i).compareTo(t) >= 0){
          super.add(i, t);
          return true;
        }
      }
      return(super.add(t));
    }
  }
  public void add(int index, T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      Boolean added = false;
      for(int i = 0; i < size(); i++){
        if (get(i).compareTo(t) >= 0){
          super.add(i, t);
          added = true;
        }
      }
      if (! added){
        super.add(t);
      }
    }
  }
  public T set(int index, T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      T oldValue = get(index);
      remove(index);
      add(t);
      return oldValue;
    }

  }
}
