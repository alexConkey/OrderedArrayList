public class NoNullArrayList<T> extends Arraylist<T> {
  public NoNullArrayList(){

  }
  public NoNullArrayList(startingCapacity){

  }
  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      super.add(t);
    }
  }
  public void add(int index, T element){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      super.add(index, t);
    }
  }
  public void set(T t){
    if (t == null){
      throw new IllegalArgumentException("Value cannot be null");
    }else{
      super.set(t);
    }
  }
}
