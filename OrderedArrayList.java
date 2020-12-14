public class OrderedArrayList<T> extends Comparable<T> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(startingCapacity){
    super(startingCapacity);
  }
  public boolean add(T t){
    for(int i = 0; i < super.size(); i++){
      if (super.get(i)>t){
        return(super.add(i, t));
      }
    }
    return(super.add(t));
  }
  public void add(int index, T t){
    Boolean added = false;
    for(int i = 0; i < super.size(); i++){
      if (super.get(i)>t){
        super.add(i, t);
        added = true;
      }
    }
    if (! added){
      super.add(t);
    }
  }
}
