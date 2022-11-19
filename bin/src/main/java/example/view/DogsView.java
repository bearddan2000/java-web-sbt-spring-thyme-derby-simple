package example.view;

import java.io.Serializable;
import java.util.*;

import example.model.Dog;
import example.repository.DogRepository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="DogsView")
@SessionScoped
public class DogsView implements Serializable {

  private static final long serialVersionUID = 1L;

  public static List<Dog> getDogs() {
    return new ArrayList<Dog>() {{
      add(new Dog(1L, "Am Bulldog", "White"));
      add(new Dog(2L, "Foxhound", "Red"));
      add(new Dog(3L, "Gr Shepard", "Black"));
    }};
  }
}
