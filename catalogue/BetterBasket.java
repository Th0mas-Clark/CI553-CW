package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Better
 * 
 * @author  Thomas Clark
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;

  @Override
  public boolean add( Product p1 ) {
    //search existing products for matching record
    for (Product p2: this) {
      if (p1.getProductNum().equals(p2.getProductNum())) {
        //found - updates quantity and returns
        p2.setQuantity(p2.getQuantity()+p1.getQuantity());
        return(true);
      }

  }
    // not found - adds new product, using superclass method
    super.add(p1); // Call add in ArrayList
    return(true);
  }
}
