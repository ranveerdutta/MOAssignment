import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mo.billing.service.BillGenerator;
import com.mo.billing.vo.Item;
import com.mo.billing.vo.Product;
import com.mo.billing.vo.ProductCategory;
import com.mo.billing.vo.SalesTax;
import com.mo.billing.vo.ShoppingCart;
import com.mo.billing.vo.Tax;


public class BillGeneratorTest {
	
	private BillGenerator billGenerator;
	@Before
	public void initBeans(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		billGenerator = (BillGenerator) applicationContext.getBean("itemizedBillConsolePrinter");
	}

	@Test
	public void test() {
		List<Item> itemList = new LinkedList<Item>();
		List<Tax> taxes = new LinkedList<Tax>();
		taxes.add(new SalesTax());
		Product productA = new Product("A", new BigDecimal(12.0), ProductCategory.A);
		Item itemA = new Item(productA, 2, taxes);
		itemList.add(itemA);
		Product productB = new Product("B", new BigDecimal(11.5), ProductCategory.B);
		Item itemB = new Item(productB, 3, taxes);
		itemList.add(itemB);
		Product productC = new Product("C", new BigDecimal(10.0), ProductCategory.C);
		Item itemC = new Item(productC, 5, taxes);
		itemList.add(itemC);
		ShoppingCart cart = new ShoppingCart(itemList);
		
		billGenerator.generateBill(cart);
	}

}
